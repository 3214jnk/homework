package java_homework.exception2.kadai_02;

public class ConnectionService {
	
	
	public void connection(String sendData) {
		SimpleConnection simpleConn = new SimpleConnection();
		try {
			simpleConn.openConnection();
			simpleConn.sendData(sendData);
		} catch (ConnectionException e) {
			System.out.println("エラー：" + e.getMessage());
		} finally {
			simpleConn.closeConnection();
		}
	}

}
