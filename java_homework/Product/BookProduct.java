package java_homework.Product;

public class BookProduct extends Product {

	public BookProduct(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	
	public BookProduct(String name, int price) {
		super(name, price, 1);
	}
	
	public String getCategoryName() {
		return "書籍";
	}
	
	public int calculateSubtotal() {
		int subtotal = getPrice() * getQuantity(); 
		return subtotal;
	}

}
