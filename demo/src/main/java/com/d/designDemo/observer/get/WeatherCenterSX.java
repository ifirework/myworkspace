package com.d.designDemo.observer.get;

import java.util.Observable;

/**
 * Created by Administrator on 2017/7/13.
 */
public class WeatherCenterSX extends Observable {

    private String time ;
    private int temperature ;
    private int compress ;

    public void setData(String time,int temperature,int compress){
        this.time = time ;
        this.temperature = temperature ;
        this.compress = compress ;
        this.setChanged();
        this.notifyObservers();
    }

    public String getTime() {
        return time;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getCompress() {
        return compress;
    }
}
