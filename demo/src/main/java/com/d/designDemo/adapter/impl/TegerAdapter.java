package com.d.designDemo.adapter.impl;

import com.d.designDemo.adapter.ainterface.Cat;
import com.d.designDemo.adapter.ainterface.Teger;

/**
 * Created by wang on 2017/7/31.
 */
public class TegerAdapter implements Teger {

    private Cat cat ;

    public TegerAdapter(Cat cat) {
        this.cat = cat ;
    }

    @Override
    public void face() {
        cat.face();
    }

    @Override
    public void waho() {
        for(int i=0;i<3;i++){
            cat.miao();
        }
    }
}
