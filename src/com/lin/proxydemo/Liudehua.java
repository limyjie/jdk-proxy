package com.lin.proxydemo;

/**
 * lin
 * 2018/7/31 13:06
 */

public class Liudehua implements Person {
    @Override
    public String sing(String name) {
        System.out.println("Liudehua sing "+name);
        return "Liudehua sing over";
    }

    @Override
    public String dance(String name) {
        System.out.println("Liudehua dance "+name);

        return "Liudehua dance over";
    }
}
