package java_homework.class_method.q8;

public class Book {
//	フィールド
	private String name = "";
	private String author = "";
	private boolean checkedOut = false;
	
//	コンストラクタ
	public Book(String name, String author, boolean checkedOut) {
		this.name = name;
		this.author = author;
		this.checkedOut = checkedOut;
		System.out.println("タイトル：" + this.name + ",著者：" + this.author + ",貸出中：" + this.checkedOut);
	}
	
//	メソッド
	public boolean borrowBook() {
		if(this.checkedOut == false) {
			boolean borrow = true;
			this.checkedOut = true;
			return borrow;
		} else {
			boolean borrow = false;
			return borrow;
		}
	}
	
	public boolean returnBook() {
		if(this.checkedOut == true) {
			boolean returnB = true;
			this.checkedOut = false;
			return returnB;
		} else {
			boolean returnB = false;
			return returnB;
		}
	}
	
	public String getStatus() {
		if (this.checkedOut == true) {
			String status = "現在貸出中です";
			return status;
		} else {
			String status = "貸出可です";
			return status;
		}
	}

}
