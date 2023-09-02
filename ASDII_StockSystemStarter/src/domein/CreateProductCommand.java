package domein;

public class CreateProductCommand implements Command {

	private StockService service;
	private String productName;
	private int aantal;

	public String execute() {
		return service.insert(productName, aantal);
	}

	public CreateProductCommand(StockService service, String productName, int aantal) {
		this.service = service;
		this.productName=  productName;
		this.aantal = aantal;
	}
}
