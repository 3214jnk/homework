package java_homework.Product;

public class DigitalProduct extends Product{

	public DigitalProduct(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	
	public DigitalProduct(String name, int price) {
		super(name, price, 1);
	}
	
	public String getCategoryName() {
		return "デジタル";
	}
	
	public int calculateSubtotal() {
		int subtotal = getPrice() * getQuantity();
		if(getQuantity() >= 3) {
			return subtotal - 500;
		} else {
			return subtotal;
		}
		
	}

}
