package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//the real subject (proxy term)
public class StockServiceController extends UnicastRemoteObject
                                    implements RemoteStockService {

    private StockService service;

    private CommandFactory factory;
    
    private UserRepository userRepository;
    
    public StockServiceController() throws RemoteException {
    	service = new StockServiceImpl();
    	factory = new CommandFactory(service);
    	userRepository = new UserRepository();
    }

	@Override
	public String performActions(String[] args) {
		User user = userRepository.getUser(args[0]);
		if (user==null) {
			return "Undefined user " + args[0];
		}
		try {
			return factory.createCommand(user.getIsAdmin(), args).execute();
		} catch (AccessDeniedException ex) {
			return "Permission denied for this operation";
		}
    }

}
