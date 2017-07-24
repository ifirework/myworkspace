package com.d.designDemo.singleten;

/**
 * Created by wang on 2017/7/24.
 */
public class SingletenUtilsSyn {
    private static volatile SingletenUtilsSyn singletenUtilsSyn ;

    private SingletenUtilsSyn(){}

    public static SingletenUtilsSyn getSingletenUtilsSynInstance(){

        if(singletenUtilsSyn==null){
            synchronized (SingletenUtilsSyn.class){
                if(singletenUtilsSyn==null){
                    singletenUtilsSyn = new SingletenUtilsSyn() ;
                }
            }
        }

        return singletenUtilsSyn ;

    }

}
