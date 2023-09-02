package domein;

public class ShowCommand implements Command {

	private StockService service;

	public String execute() {
		return String.format("DATABASE : stockstatus%n%s%n", service.productenView());
	}

	public ShowCommand(StockService service) {
		this.service = service;
	}
}
