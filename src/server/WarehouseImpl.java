package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
/**
 * 接口与实现 server
 * @author Administrator
 *
 */
public class WarehouseImpl extends UnicastRemoteObject implements Warehouse {
	protected WarehouseImpl() throws RemoteException {
		super();
		prices = new HashMap();
		prices.put("abc", 24.95);
		prices.put("ok", 2424.);
	}

	private Map<String, Double> prices;

	@Override
	public double getPrice(String desc) throws RemoteException {
		Double price = prices.get(desc);
		return price==null?0:price;
	}

}
