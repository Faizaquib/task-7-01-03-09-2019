package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class Updation {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/test";
			 String user = "root";
			 String password = "root";
			 Connection con=DriverManager.getConnection(url, user, password);
			 PreparedStatement ps1 = (PreparedStatement) con.prepareStatement("update emp set ename='Aquib' where eno=101");
			 ps1.executeUpdate();
			 System.out.println("table updated  successfully!");
			}
		catch (Exception e) {
			e.printStackTrace();
			}
	}

}
