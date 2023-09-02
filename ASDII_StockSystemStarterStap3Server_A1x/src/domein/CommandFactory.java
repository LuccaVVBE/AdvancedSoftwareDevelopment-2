package domein;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CommandFactory {

	private StockService service;
	
	public CommandFactory(StockService service) {
		this.service=service;
	}

	public Command createCommand(boolean isAdmin, String[] args) {
		StockService service = getUserStockService(isAdmin);
		args = Arrays.asList(args).subList(1, args.length).toArray(new String[0]);
		try {
			return switch (args[0].toLowerCase()) {
				case "showstock" -> new ShowCommand(service);
				case "shipproduct" -> new ShipCommand(service, args[1]);
				case "createproduct" -> new CreateProductCommand(service, args[1], Integer.parseInt(args[2]));
				case "updatequantity" -> new UpdateQuantityCommand(service, args[1], Integer.parseInt(args[2]));
				default -> new NoCommand(args[0]);
			};
			
		} catch(IndexOutOfBoundsException | NumberFormatException ex) {
			return new NoCommand(args.length > 1 
					? String.format("%s called with invalid arguments", args[0])
					: "No command arguments provided");
		}
	}

	private StockService getUserStockService(boolean isAdmin) {
		if (isAdmin) {
			return service;
		}
		return (StockService) Proxy.newProxyInstance(
				service.getClass().getClassLoader(),
				service.getClass().getInterfaces(), 
				new SimpleUserInvocationHandler(service)
		);
	}

}
