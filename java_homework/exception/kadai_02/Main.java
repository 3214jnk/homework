package java_homework.exception.kadai_02;

public class Main {

	public static void main(String[] args) {
		AgeChecker ageCheck = new AgeChecker();

//  　　自力でやってみたver
//		ageCheck.check(20);
//		ageCheck.check(15);
//		ageCheck.check(30);
		
//  　　AIに聞いたあとver
		int[] ages = {20, 15, 30};
		
		for (int age : ages) {
			try {
				ageCheck.check(age);
				System.out.println(age + "歳：利用可能です");
			} catch (IllegalArgumentException e) {
				System.out.println(age + "歳：18歳未満は利用できません");
			}
		}

	}

}
