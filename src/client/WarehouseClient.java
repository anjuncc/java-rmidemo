package client;

import java.rmi.RemoteException;
import java.util.Enumeration;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;

import server.Warehouse;

public class WarehouseClient {

	public static void main(String[] args) throws NamingException, RemoteException {
		Context namingContext = new InitialContext();
		Enumeration<NameClassPair>e = namingContext.list("rmi://localhost");
		while(e.hasMoreElements())
			System.out.println(e.nextElement().getName());
		String url = "rmi://localhost/central_warehouse";
		Warehouse centralWarehous = (Warehouse)namingContext.lookup(url);
		String desc = "abc";
		double price = centralWarehous.getPrice(desc);
		System.out.println(desc+":"+price);
	}

}
