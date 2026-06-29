package java_homework.exception2.kadai_02;

public class Main {

	public static void main(String[] args) {
		ConnectionService conn = new ConnectionService();
		
		conn.connection("hello");
		conn.connection("error");
		conn.connection("java");

	}

}
