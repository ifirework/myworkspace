package com.d.util;

import com.d.test.TestUser;
import com.d.test.UserAction;
import com.d.test.UserImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/7/6.
 */
public class CglibProxyUtils implements MethodInterceptor {

    private Object target ;
    private Logger logger ;

    private CglibProxyUtils(){
        logger = Logger.getLogger(this.getClass().getName())  ;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        logger.info("cglib代理执行了~~~~~~~~~~~~~~~~");
        return methodProxy.invokeSuper(o,args);
    }

    //获取代理对象
    public Object getCglibInstence(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create() ;
    }

    public  static CglibProxyUtils getCiglibProxy(){
        return  new CglibProxyUtils();
    }

    public static void main(String[] args) {
        CglibProxyUtils ciglibProxy = CglibProxyUtils.getCiglibProxy();
        TestUser instence = (TestUser) ciglibProxy.getCglibInstence(TestUser.class);
        instence.sayhello();
    }
}
