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
    
    private String username; //Now with user identification

    public static void main(String[] args) throws RemoteException {
        new StockSystem().run();
    }
    private RemoteStockService getRemoteService() {
    	try {
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			return (RemoteStockService) registry.lookup("stockservice");
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		return null;
	}


    private void run() throws RemoteException {
    	controller = getRemoteService();
    	System.out.println("RemoteStockSystem client running ...");
    	
    	System.out.println("Username : ");
    	username = choose.nextLine();
    	
        String action = askAction();
        String mes;
        while (!action.equalsIgnoreCase("end")) {
            mes = controller.performActions((username + " " + action).split(" "));
            System.out.print(mes);
            action = askAction();
        }
        choose.close();
    }


	private String askAction() {
        System.out.println("");
        System.out.println("User : << " + username + ">>");
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