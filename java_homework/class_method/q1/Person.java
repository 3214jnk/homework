package java_homework.class_method.q1;

public class Person {
    // フィールド
	private String name = "";
	private int    age  = 0;
	
    // メソッド
	public void introduce( String name, int age) {
		this.name = name;
		this.age  = age;
		System.out.println( "私の名前は" + this.name + "です。" );
		System.out.println( this.age + "歳です。" );
	}

}
