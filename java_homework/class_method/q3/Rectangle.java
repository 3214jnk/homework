package java_homework.class_method.q3;

public class Rectangle {
//	フィールド
	private int width  = 0;
	private int height = 0;
	
//	コンストラクタ
	public Rectangle( int width, int height ) {
		this.width  = width;
		this.height = height;
	}
	
//	メソッド
	public int getArea() {
		int result = this.width * this.height;
		return result;
	}

}
