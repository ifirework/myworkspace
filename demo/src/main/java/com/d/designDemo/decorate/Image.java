package com.d.designDemo.decorate;

import java.util.SortedMap;

/**
 * Created by wang on 2017/7/13.
 */
public class Image extends DecorateType {

    private Course course;

    public Image(Course course) {
        this.course = course;
    }

    @Override
    public String getDescri() {
        return course.getDescri()+" 图片" ;
    }

    @Override
    public int getSize() {
        return course.getSize();
    }

    @Override
    public double cost() {

        double v = course.cost() + 4.556;
        if(getSize()==1){
            System.out.println("选择的是短时间的");
            v+=1.1;
        }
        return v;
    }
}
