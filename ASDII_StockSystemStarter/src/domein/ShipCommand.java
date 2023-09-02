package domein;

public class ShipCommand implements Command {

	private StockService service;
	private String productName;

	public String execute() {
		return service.ship(productName);
	}

	public ShipCommand(StockService service, String productName) {
		this.service = service;
		this.productName = productName;
	}
}
