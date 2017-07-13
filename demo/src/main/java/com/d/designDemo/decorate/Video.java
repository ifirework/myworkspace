package com.d.designDemo.decorate;

/**
 * Created by wang on 2017/7/13.
 */
public class Video extends DecorateType {

    private Course course ;

    public Video(Course course) {
        this.course = course;
    }

    @Override
    public String getDescri() {
        return course.getDescri()+" 视频";
    }

    @Override
    public int getSize() {
        return course.getSize();
    }

    @Override
    public double cost() {
       double v =  course.cost()+4.67;
       if(getSize()==1){
           v+=2.2 ;
           System.out.println("视频选择短的");
       }
       return v ;
    }
}
