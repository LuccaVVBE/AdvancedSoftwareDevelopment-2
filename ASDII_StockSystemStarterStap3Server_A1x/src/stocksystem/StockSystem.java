package stocksystem;

import domein.*;
import java.util.Scanner;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;

public class StockSystem {

    //private RemoteStockService controller = new StockServiceController();

    public static void main(String[] args) {
        new StockSystem().run();
    }

	private void run() {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			RemoteStockService service = new StockServiceController();
			registry.rebind("stockservice", service);
			System.out.println("RemoteStockSystem service running...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}