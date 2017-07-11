package com.d.test;

import com.d.pojo.BaseUser;
import com.sun.deploy.util.ArrayUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/6.
 */
public class TestUser {

    public void sayhello(){
        System.out.println("hello cglib");
    }

    public static void main(String[] args) {

        boolean flag = true ;
        setBoolenStatus(flag);
        System.out.println(flag);
        BaseUser baseUser = new BaseUser();
        baseUser.setUserName("同篮子");
        setUserName(baseUser);
        System.out.println( baseUser.getUserName());

    }
    public static void setBoolenStatus(boolean flag){
        flag = false ;
    }
    public  static void setUserName(BaseUser user){
        user.setUserName("二狗子");

    }

    public void test1(){
        int[] ints = {6, 2, 34};
    }


}
