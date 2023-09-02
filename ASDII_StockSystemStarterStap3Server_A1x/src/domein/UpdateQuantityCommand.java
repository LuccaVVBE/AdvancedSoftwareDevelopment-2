package domein;

public class UpdateQuantityCommand implements Command {

	private StockService service;
	private String name;
	private int quantity;

	public String execute() {
		return service.update(name, quantity);
	}

	public UpdateQuantityCommand(StockService service, String name, int quantity) {
		this.service = service;
		this.name = name;
		this.quantity = quantity;
	}
}
