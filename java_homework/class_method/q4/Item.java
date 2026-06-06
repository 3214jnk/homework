package java_homework.class_method.q4;

public class Item {
//	フィールド
	private String name  = "";
	private int    price = 0;
		
//	コンストラクタ
	public Item ( String name, int price) {
		this.name  = name;
		this.price = price;
	}
	
//	メソッド
	public String getInfo() {
		String info = "商品名：" + this.name + ",価格：" +this.price + "円";
		return info;
	}

}
