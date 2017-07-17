package com.d.designDemo.factory;

/**
 * Created by wang on 2017/7/17.
 */
public class SXPizzStore extends PizzStore {

    private Pizz pizz = null ;

    public SXPizzStore() {
        System.out.println("欢迎来到山西披萨店");
    }

    @Override
    Pizz Create(String name) {
        if(name.equals("shanxi")){
            pizz = new SXPizz() ;
        }else if(name.equals("henan")){
            pizz = new HNPizz() ;
        }
        return pizz;
    }
}
