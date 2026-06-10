package java_homework.Product;

public abstract class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public abstract String getCategoryName();
	
	public abstract int calculateSubtotal();

}
