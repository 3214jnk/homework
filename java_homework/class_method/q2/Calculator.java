package java_homework.class_method.q2;

public class Calculator {
    // フィールド
	private int a = 0;
	private int b = 0;
	
    //	コンストラクタ
	public Calculator( int a, int b ) {
		this.a = a;
		this.b = b;
	}

    // メソッド	
	public int add() {
		int result = this.a + this.b;
		return result;
	}
	

}
