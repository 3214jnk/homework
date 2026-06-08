package java_homework.notification;

public class EmailNotification extends Notification {
	
	
	public EmailNotification(String recipient, String message) {
		super(recipient, message);
	}

	public void send() {
		System.out.println("メール送信：" + getRecipient() + " に「" + getMessage() + "」");
	}

}
