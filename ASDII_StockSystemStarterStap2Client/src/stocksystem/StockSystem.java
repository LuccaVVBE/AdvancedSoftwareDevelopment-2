package stocksystem;

import domein.*;
import java.util.Scanner;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;

public class StockSystem {

    private RemoteStockService controller;
    private Scanner choose = new Scanner(System.in);

    public static void main(String[] args) throws RemoteException {
        new StockSystem().run();
    }

    private void run() throws RemoteException {
    	controller = getRemoteService();
        String action = askAction();
        String mes;
        while (!action.equalsIgnoreCase("end")) {
            mes = controller.performActions(action.split(" "));
            System.out.print(mes);
            action = askAction();
        }
        choose.close();
    }

    private RemoteStockService getRemoteService() {
		// TODO Auto-generated method stub
		try {
			Registry reg =  LocateRegistry.getRegistry("localhost", 1099);
			return (RemoteStockService) reg.lookup("stockservice");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String askAction() {
        System.out.println("");
        System.out.println("-------------Usage: LoggingDemo ActionName Arguments. Enter end to quit------------");
        System.out.println("Actions:");
        System.out.println("   createProduct productname quantity");
        System.out.println("   updateQuantity productname quantity");
        System.out.println("   shipProduct productname");
        System.out.println("   showStock");       
        System.out.println("Enter action :");
        return choose.nextLine();
    }
}