/**
 * Author: lin
 * Date: 2018/12/2 13:16
 */
package com.lin.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理 和静态代理的区别是动态代理在运行时由Java反射机制动态生成代理类
 * 静态代理通常只代理一个类，动态代理是代理一个接口下的多个实现类
 * 动态代理是实现JDK里的InvocationHandler接口的invoke方法，
 * 但注意的是代理的是接口，也就是你的业务类必须要实现接口，
 * 通过Proxy里的newProxyInstance得到代理对象。
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        Dark dark = new Dark();

        InvocationHandler moveHandler = new MyHandler(car);

        InvocationHandler flyHandler = new MyHandler(dark);

        //car的代理对象
        MoveAble moveProxy = (MoveAble) Proxy.newProxyInstance(
                car.getClass().getClassLoader(),
                car.getClass().getInterfaces(),
                moveHandler);

        //dark的代理对象
        Flyable flyProxy = (Flyable) Proxy.newProxyInstance(
                dark.getClass().getClassLoader(),
                dark.getClass().getInterfaces(),
                flyHandler);

        moveProxy.move();

        flyProxy.fly();

    }
}
