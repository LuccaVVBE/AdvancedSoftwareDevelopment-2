package domein;

public interface StockService {

	String insert(String productName, int quantity);

	String update(String productName, int quantity);

	String ship(String productName);

	String productenView();

}