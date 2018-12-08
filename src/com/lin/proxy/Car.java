/**
 * Author: lin
 * Date: 2018/12/2 13:29
 */
package com.lin.proxy;

public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("car is moving..");
    }
}
