package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Creation {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/test";
			 String user = "root";
			 String password = "root";
			 Connection con=DriverManager.getConnection(url, user, password);
			 PreparedStatement ps1 = (PreparedStatement) con.prepareStatement("create table emp (eno int primary key , ename varchar(20),salary double)");
			 ps1.executeUpdate();
			 System.out.println("table created successfully!");
			}
		catch (Exception e) {
			e.printStackTrace();
			}

	}

}
