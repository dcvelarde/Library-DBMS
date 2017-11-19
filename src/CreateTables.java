import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
	
	private final String createAddressQuery = "CREATE TABLE ADDRESS1("
			  +"ADDRESS_ID INTEGER NOT NULL,"
				+"ADDRESS_LINE1 VARCHAR2(30) DEFAULT NULL,"
				+"ADDRESS_LINE2 VARCHAR2(30) DEFAULT NULL,"
				+"POSTAL_CODE VARCHAR2(15) DEFAULT NULL,"
				+"PHONE_NUMBER INTEGER DEFAULT NULL,"
				+"CITY VARCHAR2(45) DEFAULT NULL,"
				+"PROVINCE VARCHAR2(20) DEFAULT NULL,"
				+"PRIMARY KEY(ADDRESS_ID)"
				+")";
	private final String createLibUsersQuery = "CREATE TABLE LIBRARY_USERS1"
			+"("
			+"USER_ID INTEGER NOT NULL"
			+", FIRST_NAME VARCHAR2(30) DEFAULT NULL"
			+", LAST_NAME VARCHAR2(30) DEFAULT NULL"
			+", EMAIL VARCHAR2(50) DEFAULT NULL"
			+", ADDRESS_ID INTEGER DEFAULT NULL"
			+", PRIMARY KEY(USER_ID)"
			+", FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID)"
			+")";
	public CreateTables()
	{
		
	}
	
	public void createTables(Statement statement)
	{
		try 
		{
			statement.executeUpdate(createAddressQuery);
			statement.executeUpdate(createLibUsersQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
