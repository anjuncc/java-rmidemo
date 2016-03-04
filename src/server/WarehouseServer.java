package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class WarehouseServer {
	public static void main(String[] args) throws RemoteException, NamingException {
		System.out.println("construct server implemention..");
		WarehouseImpl centralWarehouse = new WarehouseImpl();
		System.out.println("binding server implemention to registry");
		Context namingContext = new InitialContext();
		LocateRegistry.createRegistry(1099); //живЊ
		namingContext.bind("rmi:central_warehouse", centralWarehouse);
		System.out.println("waing for invocations from clients..");
		
	}
}
