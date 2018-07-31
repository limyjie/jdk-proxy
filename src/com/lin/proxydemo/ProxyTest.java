package com.lin.proxydemo;

/**
 * lin
 * 2018/7/31 13:15
 *
 * https://blog.csdn.net/pangqiandou/article/details/52964066
 *
 */

public class ProxyTest {



    public static void main(String[] args) {
        LiudehuaProxy  liudehuaProxy  = new LiudehuaProxy();

        /*person 为ldh的代理对象*/
        Person person = liudehuaProxy.getProxy();


        String retValue = person.sing("bing yu");
        System.out.println(retValue);
    }

}
