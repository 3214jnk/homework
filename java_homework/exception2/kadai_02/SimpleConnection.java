package java_homework.exception2.kadai_02;

public class SimpleConnection {
	public void openConnection() {
		System.out.println("接続を開きました");
	}
	
	public void sendData(String sendData) throws ConnectionException {
		if (sendData == "error") {
			throw new ConnectionException("送信エラーが発生しました");
		} else {
			System.out.println("データを送信しました：" + sendData);
		}
	}
	
	public void closeConnection() {
		System.out.println("接続を閉じました");
		System.out.println("");
	}

}
