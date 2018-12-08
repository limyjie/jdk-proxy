/**
 * Author: lin
 * Date: 2018/12/8 10:34
 */
package com.lin.remoteproxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server say hello";
    }

    public static void main(String[] args) throws RemoteException {
        try{
            MyRemote service = new MyRemoteImpl();
            //将远程对象绑定到rmi registry，客户端将使用注册名在rmi registry中寻找该对象
            Naming.rebind("RemoteHello",service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
