package com.d.util;

import com.d.test.TestUser;
import org.aspectj.weaver.ast.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/6.
 */
public class ReflectUtils {

    public void invokeMethod(String className,String methodName,Class<?>[] args) {

        Class<Object> clazz = null;
        try {
            clazz = (Class<Object>) Class.forName(className);
            Object obj = clazz.newInstance();

            clazz.getMethod(methodName,args) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            Class<?> clazz = Class.forName(TestUser.class.getName());
            try {
                Object o = clazz.newInstance();
                try {
                    Method sayhello = clazz.getMethod("sayhello", null);
                    sayhello.invoke(o,null) ;
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
