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
		SelectExecuter se = new SelectExecuter();
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
							+ "1) SELECT * FROM COMPUTER_LOGINS WHERE LOG_IN_START_DATE >=TO_TIMESTAMP('2017-09-27','YYYY-MM-DD');\n"
							+ "2) SELECT * FROM STUDY_ROOMS WHERE MAX_CAPACITY >=5;\n"
							+ "3) SELECT * FROM ROOM_RESERVATIONS WHERE RESERVATION_START_DATE >=TO_TIMESTAMP('2017-09-26','YYYY-MM-DD') AND RESERVATION_END_DATE<TO_TIMESTAMP('2017-09-29','YYYY-MM-DD');\n"
							+ "4) SELECT * FROM ADDRESS WHERE CITY = 'TORONTO';\n"
							+ "5) SELECT * FROM BORROWED_ITEMS WHERE DUE_DATE = '04/10/2017';\n"
							+ "6) SELECT * FROM LIBRARY_USERS WHERE FIRST_NAME = 'Jason' ORDER BY LAST_NAME ASC;\n"
							+ "7) SELECT * FROM LIBRARIANS WHERE EMPLOYEE_TYPE = 'PART-TIME' ORDER BY FIRST_NAME ASC, LAST_NAME ASC;\n"
							+ "8) SELECT * FROM BOOKS WHERE AUTHOR = 'J. GEORGE' OR AUTHOR='G. TOLKIEN';\n"
							+ "9) SELECT * FROM STUDY_ROOMS WHERE MAX_CAPACITY >=5;\n"
							+ "10) SELECT LIBRARY_CARDS.USER_ID,LIBRARY_USERS.FIRST_NAME,LIBRARY_USERS.LAST_NAME"
									+"FROM LIBRARY_CARDS,LIBRARY_USERS"
									+"WHERE EXPIRY_DATE <TO_DATE('01/01/2022','MM/DD/YYYY') AND"
									+"EXPIRY_DATE>TO_DATE('01/01/2017','MM/DD/YYYY')"
									+"AND LIBRARY_CARDS.USER_ID = LIBRARY_USERS.USER_ID"
									+"ORDER BY LAST_NAME ASC;\n"
							+ "11) SELECT sr.ROOM_ID,sr.NAME"
									+"FROM STUDY_ROOMS sr"
									+"WHERE NOT EXISTS"
									+"(SELECT rr.ROOM_ID"
									+"FROM ROOM_RESERVATIONS rr"
									+"WHERE rr.RESERVATION_START_DATE>=TO_DATE('09/25/2017','MM/DD/YYYY')"
									+"AND rr.RESERVATION_END_DATE <= TO_DATE('09/30/2017','MM/DD/YYYY')"
									+"AND sr.ROOM_ID = rr.ROOM_ID)"
									+"ORDER BY NAME ASC;\n"
							+ "\n", "text");
					if(secondReturnValue != null){
						String returned = se.getSelectResults(s,Integer.parseInt(secondReturnValue));
						JOptionPane.showMessageDialog(null, returned);
					}
				}
			}
		}
		
		s.close();
		System.out.println("Closing db connection.");
		connection.close();
	}

}
