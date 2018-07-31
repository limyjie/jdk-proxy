package com.lin.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * lin
 * 2018/7/31 13:08
 *
 *
 * static Object newProxyInstance(  ClassLoader loader,
 *                                  Class<?>[] interfaces,
 *                                  InvocationHandler h)
 *
 * newProxyInstance方法用来返回一个代理对象，
 * 这个方法总共有3个参数，
 * ClassLoader loader用来指明生成代理对象使用哪个类装载器，通常和被代理对象使用同一个类加载器
 * Class<?>[] interfaces用来指明生成哪个对象的代理对象，通过接口指定，
 * InvocationHandler h用来指明产生的这个代理对象要做什么事情。
 * 所以我们只需要调用newProxyInstance方法就可以得到某一个对象的代理对象了。
 */

public class LiudehuaProxy  {

    //代理目标对象ldh
    Liudehua ldh = new Liudehua();

    //返回某个对象的代理
    public Person getProxy(){
        return (Person) Proxy.newProxyInstance(//类加载器
                                                Liudehua.class.getClassLoader(),
                                                //生成ldh的代理对象
                                                ldh.getClass().getInterfaces(),
                                                //代理对象的工作
                                                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if(method.getName().equals("sing")){
                            System.out.println("Liudehua proxy call Liudehua sing");
                            return method.invoke(ldh,args);
                        }

                        if(method.getName().equals("dance")){
                            System.out.println("Liudehua proxy call Liudehua dance");
                            return method.invoke(ldh,args);
                        }

                        return null;
                    }
                });
    }
}
