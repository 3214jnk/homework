package java_homework.Product;

public class FoodProduct extends Product{
	
	public FoodProduct(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	
	public FoodProduct(String name, int price) {
		super(name, price, 1);
	}
	
	public String getCategoryName() {
		return "食品";
	}
	
	public int calculateSubtotal() {
		int subtotal = getPrice() * getQuantity();
		if(getQuantity() >= 5) {
			return subtotal - 300;
		} else {
			return subtotal;
		}
		
	}

}
