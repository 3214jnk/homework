package java_homework.class_method.q6;

public class Product {
//　フィールド
	private String name  = "";
	private int    price = 0;
	
//	コンストラクタ
	public Product( String name, int price ) {
		this.name  = name;
		this.price = price;
		System.out.println("商品名：" + this.name + ",価格：" + this.price);
	}
	
//	メソッド
	public int getDiscountPrice( int discount) {
		int result = (int)(this.price * (100 - discount) / 100);
		return result;
	}
	
}
