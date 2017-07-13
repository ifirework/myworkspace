package com.d.designDemo.observer.get;


import com.d.designDemo.observer.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ObserverSX implements Observer,Display {
    private int temperature ;
    private int compress ;

    public ObserverSX(Observable ob) {
        ob.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherCenterSX){
            WeatherCenterSX o1 = (WeatherCenterSX) o;
            this.temperature = o1.getTemperature() ;
            this.compress = o1.getCompress() ;
            display();
        }
    }


    @Override
    public void display() {
        System.out.println(this.temperature+"------"+this.compress);
    }
}
