/**
 * Author: lin
 * Date: 2018/12/2 13:13
 */
package com.lin.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
  * InvocationHandler is the interface
  * implemented by the invocation handler of a proxy instance.
  *
  * Each proxy instance has an associated invocation handler.
  * When a method is invoked on a proxy instance,
  * the method invocation is encoded and dispatched to the invoke method of
  * its invocation handler.
 */
public class MyHandler implements InvocationHandler {

    //被代理对象
    private Object target;

    public MyHandler(Object object) {
        this.target = object;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 被代理方法
     * @param args 被代理方法参数
     * @return null
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("权限控制");
        method.invoke(target);
        System.out.println("输出日志");

        return null;

    }
}
