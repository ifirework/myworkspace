package com.d.designDemo.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wang on 2017/7/31.
 */
public class TeaFrsx  extends WaterStore{
    @Override
    public void addMaterail() {
        System.out.println("加一些山西细毛尖；");
    }

    @Override
    public void boxCup() {
        System.out.println("用瓷杯进行盛装；");
    }

    @Override
    public boolean hook() {
        System.out.println("是否充值会员 Y/N");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true ;
        String str ="y";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(str.equalsIgnoreCase("n")){
            flag = false ;
        }
        return flag ;
    }
}
