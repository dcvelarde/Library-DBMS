
public class DropTables {
	
	private String dropTablesQuery;
	private final String dropAddressQuery = "DROP TABLE ADDRESS1";
	
	public DropTables()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(dropAddressQuery);
		dropTablesQuery = sb.toString();
	}
	
	public String getDropTablesQuery()
	{
		return this.dropTablesQuery;
	}
	
}
