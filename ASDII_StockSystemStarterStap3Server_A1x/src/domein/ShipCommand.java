package domein;

public class ShipCommand implements Command {

	private StockService service;
	private String name;

	public String execute() {
		return service.ship(name);
	}

	public ShipCommand(StockService service, String name) {
		this.service = service;
		this.name = name;
	}
}
