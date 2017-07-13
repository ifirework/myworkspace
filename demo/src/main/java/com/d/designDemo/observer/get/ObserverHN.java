package com.d.designDemo.observer.get;

import com.d.designDemo.observer.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ObserverHN implements Observer ,Display{
    private String time ;
    private int compress ;

    public ObserverHN(Observable observable) {
        observable.addObserver(this);
    }

    @Override

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherCenterSX){
            WeatherCenterSX sx = (WeatherCenterSX) o;
            this.time = sx.getTime() ;
            this.compress = sx.getCompress() ;
            display();
        }
    }


    @Override
    public void display() {
        System.out.println(this.time+"-------"+this.compress);
    }
}
