package java_homework.class_method.q5;

public class BankAccount {
//	フィールド
	private String accountName = "";
	private int    balance     = 0;
	
//	コンストラクタ
	public BankAccount( String accountName, int balance) {
		this.accountName = accountName;
		this.balance     = balance;
		
		System.out.println( "口座名義；" + this.accountName);
//		System.out.println( "残高：" + this.balance + "円");
	}
	
//	メソッド
	public void deposit( int depMoney ) {
		this.balance += depMoney;
//		System.out.println( this.accountName + "さんの残高は" + this.balance + "円です");
	}
	
	public void withdraw( int withMoney ) {
		if( this.balance < withMoney ) {
//			System.out.println( "残高不足のため出金できません");
			return;
		}
		
		this.balance -= withMoney;
//		System.out.println( this.accountName + "さんの残高は" + this.balance + "円です");
	}
	
	public int getBalance() {
//		System.out.println( this.accountName + "さんの残高は" + this.balance + "円です");
		return this.balance;
	}

}
