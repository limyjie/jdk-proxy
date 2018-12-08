/**
 * Author: lin
 * Date: 2018/12/8 10:33
 */
package com.lin.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {


    public String sayHello() throws RemoteException;
}
