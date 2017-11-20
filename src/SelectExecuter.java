import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExecuter 
{
	
	public SelectExecuter(){}
	
	public String getSelectResults(Statement statement, int option)
	{
		StringBuilder sb = new StringBuilder();
		ResultSet rs = null;
		try
		{
			if(option == 1)
			{
				rs = statement.executeQuery(SelectQueries.selQuery1);   
				while(rs.next())
			{	   
					sb.append(rs.getString("first_name") + " - ");
					sb.append(rs.getString("last_name") + " - ");
					sb.append(rs.getString("email"));
					sb.append("\n");
				}
				return sb.toString();
			}
			else if(option == 2)
			{
				rs = statement.executeQuery(SelectQueries.selQuery2);
				while(rs.next())
				{
					sb.append(rs.getString("title") + "\n");
					//Get values from columns and append it to string builder object
				}
				return sb.toString();
			}
			else if(option == 3)
			{
				rs = statement.executeQuery(SelectQueries.selQuery3);
				while(rs.next())
				{
					sb.append(rs.getString("name") + " - " + rs.getString("MAX_CAPACITY")+"\n");
					//Get values from columns and append it to string builder object
				}
				return sb.toString();
			}
			else if(option == 4)
			{
				rs = statement.executeQuery(SelectQueries.selQuery4);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 5)
			{
				rs = statement.executeQuery(SelectQueries.selQuery5);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 6)
			{
				rs = statement.executeQuery(SelectQueries.selQuery6);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 7)
			{
				rs = statement.executeQuery(SelectQueries.selQuery7);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 8)
			{
				rs = statement.executeQuery(SelectQueries.selQuery8);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 9)
			{
				rs = statement.executeQuery(SelectQueries.selQuery9);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else if(option == 10)
			{
				rs = statement.executeQuery(SelectQueries.selQuery10);
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
			}
			else
			{
				rs = statement.executeQuery(SelectQueries.selQuery11);				
				while(rs.next())
				{
					//Get values from columns and append it to string builder object
				}
				
			}
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
