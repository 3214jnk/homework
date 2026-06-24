package java_homework.exception.kadai_03;

public class UserValidator {
	
	public void nameCheck(String name) throws InvalidUserException {
		if (name == null || name.isBlank()) {
			throw new InvalidUserException("名前が入力されていません");
		}
	}

}
