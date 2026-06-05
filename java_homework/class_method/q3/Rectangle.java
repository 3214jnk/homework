package java_homework.class_method.q3;

public class Rectangle {
//	フィールド
	private int width  = 0;
	private int height = 0;
	
//	メソッド
	public int getArea( int width, int height) {
		this.width  = width;
		this.height = height;
		int result = this.width * this.height;
		System.out.println(result);
		return result;
	}

}
