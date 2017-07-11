package com.d.test;

import com.d.interfaces.UserInterface;

/**
 * Created by Administrator on 2017/7/6.
 */
public class UserImpl implements UserInterface {
    @Override
    public void println() {
        System.out.println("这是实现user接口实现的第一个方法");
    }
}
