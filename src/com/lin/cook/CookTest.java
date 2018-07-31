package com.lin.cook;

import java.lang.reflect.Proxy;

/**
 * lin
 * 2018/7/31 15:07
 */

public class CookTest {
    public static void main(String[] args) {
        //厨子
        Cook cook=new Cook();
        //厨子的代理者
        CookProxy cookProxy=new CookProxy();
        //代理这个厨子
        cookProxy.setCook(cook);

        /**
         *
         * ClassLoader是一个抽象类，作用是将字节码文件加载进虚拟机并生成相应的class（注意是小写的），
         *  这里得到的loader是其子类AppClassLoader（负责加载应用层字节码）的一个实例
         * interfaces就是被实现的那些业务接口，
         * h是InvocationHandler接口的实例
         */
        CookFood cookFood=(CookFood)Proxy.newProxyInstance(cookProxy.getClass().getClassLoader(),
                                                            cook.getClass().getInterfaces(),
                                                            cookProxy);
        cookFood.cookMeat();
    }
}
