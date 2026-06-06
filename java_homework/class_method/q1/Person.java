package java_homework.class_method.q1;

public class Person {
    // フィールド
	private String name = "";
	private int    age  = 0;
	
    //	コンストラクタ
	public Person( String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
    // メソッド
	public String introduce() {
		return "私の名前は" + this.name + "です。" + this.age + "歳です。"
;	}

}

