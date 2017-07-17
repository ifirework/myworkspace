package com.d.designDemo.factory;

/**
 * Created by wang on 2017/7/17.
 */
public abstract class PizzStore {
    private Pizz pizz = null ;
    //订单
    public Pizz Order(String name){
         System.out.println("order some pizz");
         Pizz pizz = Create(name);
         pizz.prepare();
         pizz.cut();
         pizz.box();

         return pizz ;
    }
    //生产
    abstract Pizz Create(String name);
}
