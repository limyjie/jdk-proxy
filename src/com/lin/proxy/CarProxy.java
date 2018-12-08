/**
 * Author: lin
 * Date: 2018/12/2 13:30
 */
package com.lin.proxy;

public class CarProxy implements MoveAble{

    MoveAble car;

    public CarProxy(MoveAble car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("权限控制");
        car.move();
        System.out.println("输出日志");

    }
}
