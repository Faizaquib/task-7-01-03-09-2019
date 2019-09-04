package jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class insertion {

	public static void main(String[] args) throws Exception {
	
	try {
		 Class.forName("com.mysql.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/test";
		 String user = "root";
		 String password = "root";
		 Connection con=DriverManager.getConnection(url, user, password);
		 PreparedStatement ps1 = (PreparedStatement) con.prepareStatement("insert into emp values (101,'Faiz',1000.0)");
		 ps1.executeUpdate();
		 System.out.println("data feeded successfully!");
		}
	catch (Exception e) {
		e.printStackTrace();
		}
			
	
}

}
