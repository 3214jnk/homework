package java_homework.exception.kadai_03;

public class UserService {
	private UserValidator validator = new UserValidator();
	
	public void signUp(String name) throws InvalidUserException {
		
		try {
			validator.nameCheck(name);
			System.out.println(name + " を登録しました");
		} catch (InvalidUserException e) {
			System.out.println("UserServiceで例外を検知しました：" + e.getMessage());
			throw e;
			
		}
		
		
	}

}
