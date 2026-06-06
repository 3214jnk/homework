package java_homework.class_method.q7;

public class Student {
//	フィールド
	private String name  = "";
	private int english  = 0;
	private int math     = 0;
	private int japanese = 0;
	
	
//	コンストラクタ
	public Student( String name, int english, int math, int japanese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.japanese = japanese;
		
		System.out.println("名前：" + this.name + "英語：" + this.english + "点,数学：" + this.math + "点,国語：" + this.japanese + "点");
	}
	
//	メソッド
	public int getTotal() {
		int total = this.english + this.math + this.japanese;
		return total;
	}
	
	public double getAverage() {
		double average = (double)getTotal() / 3;
		return average;
	}
	
	public boolean isPassed() {
		boolean passed = getAverage() >= 60;
		return passed;
	}

}
