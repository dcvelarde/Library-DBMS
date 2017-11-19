import java.sql.Statement;

public class DropTables {
	
	private final String dropAddressQuery = "DROP TABLE ADDRESS";
	private final String dropLibUsersQuery = "DROP TABLE LIBRARY_USERS";
	
	public DropTables()
	{
		
	}
	
	public void dropTables(Statement statement)
	{
		try
		{
			statement.executeUpdate(dropAddressQuery);
			statement.executeUpdate(dropLibUsersQuery);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
