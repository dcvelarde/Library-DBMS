import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		connection = DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521/orcl","system","oracle");
		System.out.println("Connected to database.");
		Statement s = connection.createStatement();
//		
//		ResultSet rs = s.executeQuery("SELECT * FROM LIBRARY_USERS");
//		
//		while(rs.next())
//		{
//			String firstName = rs.getString("first_name");
//			String lastName = rs.getString("last_name");
//			String email = rs.getString("email");
//			System.out.println(firstName+" "+lastName+" "+email);
//		}
//		rs.close();
//		
//		rs = s.executeQuery("SELECT * FROM ITEMS");
//		while(rs.next())
//		{
//			String title = rs.getString("title");
//			System.out.println(title);
//		}
//		rs.close();
		
		CreateTables ct = new CreateTables();
		DropTables dt = new DropTables();
		PopulateTables pt = new PopulateTables();
		
		String[] buttons = { "Create Tables", "Populate Tables", "Drop Tables", "Queries","Cancel"};
		int returnValue = 0;
		String secondReturnValue = "";
		while(returnValue != 4)
		{
			returnValue = JOptionPane.showOptionDialog(null, "Please select one of the following options: ",
			"Library DBMS", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons[0]);
			if(returnValue == 0)
			{
				ct.createTables(s);
				JOptionPane.showMessageDialog(null, "Successfully created tables.");
			}
			else if(returnValue == 1)
			{
				pt.populateTables(s);
				JOptionPane.showMessageDialog(null, "Successfully populated tables.");
			}
			else if(returnValue == 2)
			{
				dt.dropTables(s);
				JOptionPane.showMessageDialog(null, "Dropped All Tables.");
			}
			if(returnValue == 3)
			{
				while(secondReturnValue != null)
				{
					secondReturnValue = JOptionPane.showInputDialog("Select a query to execute: \n"
							+ "1) SELECT * FROM LIBRARY_USERS\n"
							+ "2) SELECT * FROM ITEMS\n", "text");
					if(secondReturnValue != null)
						JOptionPane.showMessageDialog(null, "Results from Query printed here.");
				}
			}
		}
		
		s.close();
		System.out.println("Closing db connection.");
		connection.close();
	}

}
