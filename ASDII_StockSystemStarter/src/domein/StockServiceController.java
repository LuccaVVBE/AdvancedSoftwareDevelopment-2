package domein;

public class StockServiceController {

    private StockService service;

    private CommandFactory factory;

    
    public StockServiceController() {
    	service = new StockService();
    	factory = new CommandFactory(service);
    }
	public String performActions(String[] args) {
		return factory.createCommand(args).execute();
    }


}
