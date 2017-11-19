import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		connection = DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521/orcl","system","oracle");
		System.out.println("Connected to database.");
		Statement s = connection.createStatement();
		
		ResultSet rs = s.executeQuery("SELECT * FROM LIBRARY_USERS");
		
		while(rs.next())
		{
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String email = rs.getString("email");
			System.out.println(firstName+" "+lastName+" "+email);
		}
		rs.close();
		
		rs = s.executeQuery("SELECT * FROM ITEMS");
		while(rs.next())
		{
			String title = rs.getString("title");
			System.out.println(title);
		}
		rs.close();
		s.close();
		System.out.println("Closing db connection.");
		connection.close();
	}

}
