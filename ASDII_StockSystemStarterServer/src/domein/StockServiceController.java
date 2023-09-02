package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockServiceController extends UnicastRemoteObject implements RemoteStockService {

    private StockService service;

    private CommandFactory factory;

    
    public StockServiceController() throws RemoteException{
    	service = new StockService();
    	factory = new CommandFactory(service);
    }
	@Override
	public String performActions(String[] args) {
		return factory.createCommand(args).execute();
    }


}
