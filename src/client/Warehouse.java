package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Warehouse extends Remote{
	double getPrice(String desc) throws RemoteException;
}
