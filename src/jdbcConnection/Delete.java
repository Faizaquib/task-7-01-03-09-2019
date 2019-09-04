package jdbcConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
public class Delete {

	public static void main(String[] args) throws Exception {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password ="root";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement st1 = (PreparedStatement) con.prepareStatement("delete from emp");
		st1.executeUpdate();
		System.out.println("table deleted sucessfully!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
