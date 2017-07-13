package com.d.designDemo.decorate;

/**
 * Created by wang on 2017/7/13.
 */
public class BaseCourse extends Course {
    int num =0 ;


    @Override
    public String getDescri() {
        return "基础" ;
    }

    @Override
    public int getSize() {
        return num;
    }

    @Override
    public void setSize(int num) {
        this.num = num ;
    }

    @Override
    public double cost() {//课程价格
        return 3.44;
    }
}
