
public class DropTables {
	
	private String dropTablesQuery;
	
	public DropTables()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("DROP TABLE ADDRESS1");
		dropTablesQuery = sb.toString();
	}
	
	public String getDropTablesQuery()
	{
		return this.dropTablesQuery;
	}
	
}
