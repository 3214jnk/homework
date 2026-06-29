package java_homework.exception2.kadai_01;

public class Main {

	public static void main(String[] args) {
		AgeChecker ageChecker = new AgeChecker();
		
		int[] ages = {20, 15, 30};
		
		for (int age : ages) {
			try {
				ageChecker.ageCheck(age);
			} catch (AgeCheckException e) {
				System.out.println(age + "歳：" + e.getMessage());
			}
		}
		

	}

}
