package java_homework.notification;

abstract public class Notification {
// フィールド
	private String recipient;
	private String message;
	
//	コンストラクタ
	public Notification(String recipient, String message) {
		this.recipient = recipient;
		this.message   = message;
	}
	
//	メソッド
	public String getRecipient() {
		return this.recipient;
	};
	public String getMessage() {
		return this.message;
	};
	
	abstract public void send();
	
}
