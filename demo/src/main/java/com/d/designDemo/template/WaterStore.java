package com.d.designDemo.template;


/**
 * Created by wang on 2017/7/31.
 */
public abstract class WaterStore {

    public void prepare(){
        addWater();
        addMaterail();
        boil();
        boxCup();
        if(hook()){
            System.out.println("开通一年会员~~~~~~~~");
        }
    }

    public void addWater(){
        System.out.println("先加水500ml");
    }

    public abstract void addMaterail();

    public void boil(){
        System.out.println("煮30min");
    }

    public abstract void boxCup();

    public boolean hook(){
        return true ;
    }
}
