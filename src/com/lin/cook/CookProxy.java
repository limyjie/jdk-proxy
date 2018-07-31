package com.lin.cook;

/**
 * lin
 * 2018/7/31 14:53
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Cook 的代理者
 */
public class CookProxy implements InvocationHandler {

    //被代理对象 cook
    private Cook cook;

    //设置被代理对象
    public void setCook(Cook cook) {
        this.cook = cook;
    }

    /**
     *
     * @param proxy  被调用方法的的代理实例
     * @param method
     * @param args  参数数组
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("I have told he to "+method.getName());
        method.invoke(cook,args);
        System.out.println("He have finished cook");
        return null;
    }
}
