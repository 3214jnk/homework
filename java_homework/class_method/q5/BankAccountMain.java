package java_homework.class_method.q5;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BankAccount sakamoto = new BankAccount( "坂本太郎", 0);
		
		sakamoto.deposit(10000);
		sakamoto.withdraw(5000);
		sakamoto.withdraw(6000);
		
		System.out.println(sakamoto.getBalance());
		
	}

}
