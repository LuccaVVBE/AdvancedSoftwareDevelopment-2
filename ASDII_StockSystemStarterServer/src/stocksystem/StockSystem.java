package stocksystem;

import domein.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StockSystem {

    //private RemoteStockService controller = new StockServiceController();

    public static void main(String[] args) {
        new StockSystem().run();
    }

    private void run() {
        try {
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind	("stockservice", new StockServiceController());
			System.out.println("Remote service running...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}