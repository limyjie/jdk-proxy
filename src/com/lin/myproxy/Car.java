/**
 * Author: lin
 * Date: 2018/12/2 13:12
 */
package com.lin.myproxy;

import com.lin.jdkproxy.MoveAble;

public class Car implements MoveAble{


    @Override
    public void move() {
        System.out.println("汽车行驶中..");
    }
}
