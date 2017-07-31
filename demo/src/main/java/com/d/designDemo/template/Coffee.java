package com.d.designDemo.template;

/**
 * Created by wang on 2017/7/31.
 */
public class Coffee extends WaterStore {
    @Override
    public void addMaterail() {
        System.out.println("加一些咖啡豆；");
    }

    @Override
    public void boxCup() {
        System.out.println("用大杯盛装；");
    }
}
