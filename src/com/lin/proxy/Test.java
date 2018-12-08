/**
 * Author: lin
 * Date: 2018/12/2 13:31
 */
package com.lin.proxy;

/**
 * 静态代理  实现方式：组合，需要被代理的对象实现某一特定的接口，以保证二者有一致的行为
 *
 * 缺点是，加入要对项目中的所有类添加 日志代理（调用前输出日志，调用后输出日志）
 * 那么我必须要让所有的类实现一个 logger 接口，然后在代理类中 进行相应的日志输出，
 * 这样子代码会异常的臃肿
 *
 * 每个静态代理类只能为一个接口服务，被代理对象在编译时就已经确定
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();


        CarProxy carProxy = new CarProxy(car);
        carProxy.move();
    }
}
