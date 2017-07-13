package com.d.designDemo.strategy.engine;

import com.d.designDemo.strategy.Engine;

/**
 * Created by Administrator on 2017/7/13.
 */
public class BigEngine implements Engine {
    @Override
    public void useEngine() {
        System.out.println("Big engine!!!!!");
    }
}
