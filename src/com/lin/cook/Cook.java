package com.lin.cook;

/**
 * lin
 * 2018/7/31 14:50
 */

/**
 * 方法的执行者
 */
public class Cook implements CookFood {
    @Override
    public void cookFish() {
        System.out.println("Cook fish");
    }

    @Override
    public void cookMeat() {
        System.out.println("Cook meat");
    }
}
