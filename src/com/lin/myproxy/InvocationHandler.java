/**
 * Author: lin
 * Date: 2018/12/2 15:54
 */
package com.lin.myproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandler {

    private Object target;

    public InvocationHandler(Object target) {
        this.target = target;
    }

    public void invoke(Object proxy,Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("启动");

        method.invoke(target);

        System.out.println("停止");
    }

}
