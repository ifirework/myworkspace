package com.d.util;

import com.d.interfaces.UserInterface;
import com.d.test.UserAction;
import com.d.test.UserImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/7/6.
 */
public class JdkProxyUtils implements InvocationHandler{

    private Object target ;
    private Logger logger=null ;
    private JdkProxyUtils(){
         logger = Logger.getLogger(this.getClass().getName()) ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       logger.info("jdk代理执行了~~~~~~~~~~~~~~");
        return method.invoke(target,args);
    }

    public Object newInstenceProxy(Object obj){
        this.target = obj ;
        Object proxy = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
        return proxy ;
    }

    public static JdkProxyUtils getJdkProxyObj(){
        return  new JdkProxyUtils() ;
    }


    public static void main(String[] args) {
        JdkProxyUtils proxyObj = JdkProxyUtils.getJdkProxyObj();
        UserInterface  proxy = (UserInterface) proxyObj.newInstenceProxy(new UserImpl());

        proxy.println();

    }

}


