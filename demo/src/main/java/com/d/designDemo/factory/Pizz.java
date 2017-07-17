package com.d.designDemo.factory;

/**
 * Created by wang on 2017/7/17.
 */
public abstract class Pizz {

    String name ;
    String dough ;


    void prepare(){
        System.out.println("Pizz Name :"+name);
        System.out.println("add some apple");
    }

    void cut(){
        System.out.println("cut some piece");
    }

    void box(){
        System.out.println("put in box");
    }

    public String getName(){
        return name ;
    }
}
