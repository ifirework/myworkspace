package com.d.designDemo.observer;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ObverserWQ implements ObverserCenter {

    public ObverserWQ(WeatherCenter weatherCenter) {
        weatherCenter.register(this);
    }

    @Override
    public void update(String time, int temperature, int compress) {
        System.out.println(time+"=="+temperature+"=="+compress);
    }
}
