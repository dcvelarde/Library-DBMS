import java.sql.Date;
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
//					SELECT * FROM COMPUTER_LOGINS WHERE LOG_IN_START_DATE >=TO_TIMESTAMP('2017-09-27','YYYY-MM-DD');
					int compID = rs.getInt("COMP_ID");
					int cardNum = rs.getInt("CARD_NUM");
					Date loginStartDate = rs.getDate("LOG_IN_START_DATE");
					Date loginEndDate = rs.getDate("LOG_IN_END_DATE");
					sb.append(compID+"		"+cardNum+"		"+loginStartDate.toString()+"		"+loginEndDate.toString()+"\n");
				}
				return sb.toString();
			}
			else if(option == 2)
			{
				rs = statement.executeQuery(SelectQueries.selQuery2);
				while(rs.next())
				{
//					SELECT * FROM STUDY_ROOMS WHERE MAX_CAPACITY >=5
				}
				return sb.toString();
			}
			else if(option == 3)
			{
				rs = statement.executeQuery(SelectQueries.selQuery3);
				while(rs.next())
				{
//				SELECT * FROM ROOM_RESERVATIONS WHERE RESERVATION_START_DATE 
//					>=TO_TIMESTAMP('2017-09-26','YYYY-MM-DD') AND RESERVATION_END_DATE<TO_TIMESTAMP('2017-09-29','YYYY-MM-DD')
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
