package com.d.designDemo.adapter.impl;

import com.d.designDemo.adapter.ainterface.Teger;

/**
 * Created by wang on 2017/7/31.
 */
public class Bigteger implements Teger {
    @Override
    public void face() {
        System.out.println("I have a big eyes  ： 老虎");
    }

    @Override
    public void waho() {
        System.out.println("I can say waho : 哇哦");

    }
}
