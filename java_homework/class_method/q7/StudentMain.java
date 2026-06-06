package java_homework.class_method.q7;

public class StudentMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student satou = new Student("佐藤", 70, 65, 73);
		
		System.out.println(satou.getTotal());
		System.out.println(satou.getAverage());
		System.out.println(satou.isPassed());
		
		
		Student suzuki = new Student("鈴木", 56, 74, 43);
		System.out.println(suzuki.getTotal());
		System.out.println(suzuki.getAverage());
		System.out.println(suzuki.isPassed());
		
	}

}
