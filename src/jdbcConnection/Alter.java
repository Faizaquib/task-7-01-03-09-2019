package jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class Alter {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String passowrd = "root";
			Connection con = DriverManager.getConnection(url,user,passowrd);
			PreparedStatement st1 = (PreparedStatement) con.prepareStatement("alter table emp add degn varchar(20)");
			st1.executeUpdate();
			System.out.println("new column added sucessfully!");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
