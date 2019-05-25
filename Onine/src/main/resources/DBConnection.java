import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/paymentdb";
		String username="root";
		String password="root"
				
		try{
			try {
				class.forName("com.mysql.jdbc.Driver");
			}
			catch(Exception e) {
				e.printStackTrace();
		}
		
		con = DriverManager.getConnection(url, username, password);
		System.out.println("Print connection object"+con);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	}
}
