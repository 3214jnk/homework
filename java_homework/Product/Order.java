package java_homework.Product;

import java.util.ArrayList;

public class Order {
	private String customerName;
	private ArrayList<Product> products;
	
	public Order(String customerName) {
		this.customerName = customerName;
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void addProduct(Product[] products) {
		for (Product product : products) {
			addProduct(product);
		}
	}
	
	public void printProducts() {
		for (Product product : this.products) {
			System.out.println(product.getCategoryName() + "：" +
		                       product.getName() + " / 単価" +
					           product.getPrice() + "円 / 数量" +
		                       product.getQuantity() + "個 / 小計" +
					           product.calculateSubtotal() + "円");
		}
	}
	
	public int calculateProductTotal() {
		int total = 0;
		for (Product product : this.products) {
			total += product.calculateSubtotal();
		}
		return total;
	}
	
	public int calculateShippingFee() {
		if(calculateProductTotal() >= 5000) {
			return 0;
		} else {
			return 500;
		}
	}
	
	public int calculateOrderTotal() {
		return calculateProductTotal() + calculateShippingFee();
	}
	
	public void printOrderSummary() {
		System.out.println("注文者：" + this.customerName);
		System.out.println();
		System.out.println("【商品一覧】");
		printProducts();
		System.out.println();
		System.out.println("商品合計：" + calculateProductTotal() + "円");
		System.out.println("送料：" + calculateShippingFee() + "円");
		System.out.println("注文合計：" + calculateOrderTotal() + "円");
	}

}
