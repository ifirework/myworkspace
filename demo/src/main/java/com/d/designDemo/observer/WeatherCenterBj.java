package com.d.designDemo.observer;

import java.awt.peer.LightweightPeer;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/13.
 */
public class WeatherCenterBj implements WeatherCenter {

    private String time ;
    private int temperature ;
    private int compress ;

    ArrayList<ObverserCenter> list =null ;

    public WeatherCenterBj() {
        list = new ArrayList<ObverserCenter>() ;
    }
    public void setWeatherData(String time,int temperature,int compress){

        this.time = time ;
        this.temperature = temperature ;
        this.compress = compress ;
        dataChange();
    }



    @Override
    public void register(ObverserCenter obverser) {
        list.add(obverser) ;
        System.out.println("订阅成功!!");
    }

    @Override
    public void delObverser(ObverserCenter obverser) {
        if(list.indexOf(obverser)!=-1){
            list.remove(obverser) ;
            System.out.println("退订成功!!");
        }
    }

    @Override
    public void dataChange() {
        for(int i=0;i<list.size();i++){
            ObverserCenter obverserCenter = list.get(i);
            obverserCenter.update(getTime(),getTemperature(),getCompress());
        }
    }

    public String getTime() {
        return this.time;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getCompress() {
        return this.compress;
    }
}
