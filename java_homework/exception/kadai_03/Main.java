package java_homework.exception.kadai_03;

public class Main {

	public static void main(String[] args) {
		UserService user = new UserService();
		
		String[] names = {"田中さん", "", "佐藤さん"};
		
		for (String name : names) {
			try {
				user.signUp(name);
			} catch (InvalidUserException e) {
				System.out.println("登録失敗：" + e.getMessage());
			}
		}
		

	}

}
