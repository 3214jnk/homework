package java_homework.exception2.kadai_01;

public class AgeChecker {
	public void ageCheck(int age) throws AgeCheckException{
		if( age >= 18 ) {
			System.out.println(age + "歳：利用可能です");
		} else {
			throw new AgeCheckException("18歳未満は利用できません");
		}
	}

}
