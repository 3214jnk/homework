package java_homework.exception.kadai_02;

public class AgeChecker {
	
	public void check (int age) {
		
//　　　自力でやってみたver
//		try {
//			if (age >= 18) {
//				System.out.println(age + "歳：利用可能です");
//			} else {
//				throw new IllegalArgumentException();
//			}
//		} catch (IllegalArgumentException e) {
//			System.out.println(age + "歳：18歳未満は利用できません");
//		}
		
//　　　AIに聞いたあとver
		if (age < 18) {
			throw new IllegalArgumentException();
		}
		
	}

}
