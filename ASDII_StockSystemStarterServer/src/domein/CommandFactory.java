package domein;

public class CommandFactory {

	private StockService service;

	public Command createCommand(String[] args) {
		try {
			return switch (args[0].toLowerCase()) {
			case "showstock" -> new ShowCommand(service);
			case "updatequantity" -> new UpdateQuantityCommand(service, args[1], Integer.parseInt(args[2]));
			case "createproduct" -> new CreateProductCommand(service, args[1], Integer.parseInt(args[2]));
			case "shipproduct" -> new ShipCommand(service, args[1]);
			default -> new NoCommand(args[0]);
			};
		} catch (IndexOutOfBoundsException | NumberFormatException ex) {
			return new NoCommand(args.length > 1 ? String.format("%s called with invalid arguments.", args[0])
					: "No command arguments provided.");
		}
	}

	public CommandFactory(StockService service) {
		this.service = service;
	}
}
