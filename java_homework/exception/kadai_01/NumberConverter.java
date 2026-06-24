package java_homework.exception.kadai_01;

public class NumberConverter {
	
	public void convert(String str) {
		try {
			int n = Integer.parseInt(str);
			System.out.println(n + " は数値に変換できました");
		} catch (NumberFormatException e) {
			System.out.println(str + " は数値に変換できません");
		}
	}
	
}