package week4.day1.assignment;

public class JavaConnection extends MySqlConnection {


	public void connect() {
		System.out.println("Connecting Database");
		
	}

	public void disconnect() {
		System.out.println("Disconnecting Database");
		
	}

	public void executeUpdate() {
		System.out.println("Update Database");
		
	
	}

	public void executeQuery() {
		System.out.println("Executing mysqlconnection");
		
	}
	public static void main(String[] args) {
		JavaConnection j1 = new JavaConnection();
		j1.connect();
		j1.disconnect();
		j1.executeUpdate();
		j1.executeQuery();
		
	}


}
