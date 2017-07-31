package com.d.designDemo.adapter.impl;

import com.d.designDemo.adapter.ainterface.Cat;

/**
 * Created by wang on 2017/7/31.
 */
public class SmallCat implements Cat {
    @Override
    public void face() {
        System.out.println("I have a small eyes!! ： 小猫");
    }

    @Override
    public void miao() {
        System.out.println("I say miao miao!!!");
    }
}
