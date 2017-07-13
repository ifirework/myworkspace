package com.d.designDemo.strategy;

/**
 * Created by Administrator on 2017/7/13.
 */
public abstract class Car {

    private Engine engine ;

    public void setEngine(Engine engine){
        this.engine = engine ;
        byEngine();
    }


    public void byEngine(){
        this.engine.useEngine();
    }

    public void run(){
        System.out.println("We can run!!!!");
    }



}
