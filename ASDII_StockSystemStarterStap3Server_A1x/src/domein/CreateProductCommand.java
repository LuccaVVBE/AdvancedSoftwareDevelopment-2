package domein;

public class CreateProductCommand implements Command {

	private StockService service;
	private String name;
	private int quantity;

	public String execute() {
		return service.insert(name, quantity);
	}

	public CreateProductCommand(StockService service, String name, int quantity) {
		this.service = service;
		this.name = name;
		this.quantity = quantity;
	}
}
