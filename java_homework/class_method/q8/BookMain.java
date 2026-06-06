package java_homework.class_method.q8;

public class BookMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Book onePiece = new Book("ONE PIECE", "尾田栄一郎", false);
		
		System.out.println(onePiece.borrowBook());
		System.out.println(onePiece.returnBook());
		System.out.println(onePiece.returnBook());
		System.out.println(onePiece.getStatus());
		
		Book haikyu = new Book("ハイキュー!!", "古舘春一", false);
		System.out.println(haikyu.borrowBook());
		System.out.println(haikyu.borrowBook());
		System.out.println(haikyu.getStatus());
	}

}
