package domein;

public class UpdateQuantityCommand implements Command {

	private StockService service;
	private String productName;
	private int aantal;

	public String execute() {
		return service.update(productName, aantal);
	}

	public UpdateQuantityCommand(StockService service, String productName, int aantal) {
		this.service = service;
		this.productName = productName;
		this.aantal = aantal;
	}
}
