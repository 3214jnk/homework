package java_homework.Product;

public class Main {

	public static void main(String[] args) {
		Order satouOrder = new Order("佐藤さん");
		
		Product[] satouProducts = {
				new BookProduct("java入門", 2000),
				new FoodProduct("りんご", 150, 6),
				new DigitalProduct("学習アプリ利用権", 1200, 3)
		};
		
		satouOrder.addProduct(satouProducts);
		
		satouOrder.printOrderSummary();

	}

}
