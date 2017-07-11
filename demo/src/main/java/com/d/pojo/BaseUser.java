package com.d.pojo;

/**
 * Created by Administrator on 2017/7/4.
 */
public class BaseUser {

    private  String userName;

    public BaseUser(String userName, int age, String address, int sex) {
        this.userName = userName;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    private int age;
    private String address ;
    private int sex;

    public BaseUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
