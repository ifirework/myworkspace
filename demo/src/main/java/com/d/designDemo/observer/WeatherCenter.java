package com.d.designDemo.observer;

/**
 * Created by Administrator on 2017/7/13.
 */
public interface WeatherCenter {

    void register(ObverserCenter obverser) ;
    void delObverser(ObverserCenter obverser) ;
    void dataChange() ;
}
