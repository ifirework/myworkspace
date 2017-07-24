package com.d.designDemo.singleten;

/**
 * Created by wang on 2017/7/24.
 */
public class SingletenUtils {
    private static SingletenUtils singletenUtils ;
    private SingletenUtils(){}


    public static SingletenUtils getSingletenInstence(){
        if(singletenUtils == null){
            singletenUtils = new SingletenUtils() ;
        }

        return singletenUtils ;
    }

}
