
public class CreateTables {
	
	private String createTablesQuery;
	
	public CreateTables()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE ADDRESS1("
		  +"ADDRESS_ID INTEGER NOT NULL,"
		+"ADDRESS_LINE1 VARCHAR2(30) DEFAULT NULL,"
		+"ADDRESS_LINE2 VARCHAR2(30) DEFAULT NULL,"
		+"POSTAL_CODE VARCHAR2(15) DEFAULT NULL,"
		+"PHONE_NUMBER INTEGER DEFAULT NULL,"
		+"CITY VARCHAR2(45) DEFAULT NULL,"
		+"PROVINCE VARCHAR2(20) DEFAULT NULL,"
		+"PRIMARY KEY(ADDRESS_ID)"
		+")");
		createTablesQuery = sb.toString();
	}
	
	public String getCreateTablesQuery()
	{
		return this.createTablesQuery;
	}
}
