package com.d.test;

/**
 * Created by wang on 2017/7/19.
 */
public class TestSingle {

    private static volatile TestSingle single = null ;

    private TestSingle() {
    }
    public static TestSingle getInstence(){

        if(single==null){
            synchronized (TestSingle.class){
                if(single==null){
                 single = new TestSingle();
                }
            }

        }

        return single ;
    }

}
