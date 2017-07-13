package com.d.designDemo.decorate;

/**
 * Created by wang on 2017/7/13.
 */
public abstract class Course {
    String descri ;
    public String getDescri(){
        return "undefined Course" ;
    }
    public abstract int getSize() ;
    public abstract void setSize(int num) ;

    public abstract double cost() ;

}
