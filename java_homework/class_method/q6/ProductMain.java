package java_homework.class_method.q6;

public class ProductMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Product coffee = new Product("コーヒー", 500);
		
		System.out.println(coffee.getDiscountPrice(10));
		
		Product cake   = new Product("ケーキ", 400);
		
		System.out.println(cake.getDiscountPrice(20));
	}

}
