package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

//the subject (proxy term) (! niet observer)
public interface RemoteStockService extends Remote {

	String performActions(String[] args) throws RemoteException;

}