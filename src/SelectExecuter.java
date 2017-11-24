import java.math.BigInteger;
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
				sb.append("COMP_ID\tCARD_NUM\tLOG_IN_START_DATE\tLOG_IN_END_DATE\n");
				while(rs.next())
				{	   
					int compID = rs.getInt("COMP_ID");
					int cardNum = rs.getInt("CARD_NUM");
					Date loginStartDate = rs.getDate("LOG_IN_START_DATE");
					Date loginEndDate = rs.getDate("LOG_IN_END_DATE");
					sb.append(compID+"\t"+cardNum+"\t"+loginStartDate.toString()+"\t\t"+loginEndDate.toString()+"\n");
				}
				return sb.toString();
			}
			else if(option == 2)
			{
				rs = statement.executeQuery(SelectQueries.selQuery2);
				sb.append("ROOM_ID\tLOCATION_IN_LIBRARY_ID\tNAME\tMAX_CAPACITY\n");
				while(rs.next())
				{
					int roomID = rs.getInt("ROOM_ID");
					int locInLib = rs.getInt("LOCATION_IN_LIBRARY_ID");
					String name = rs.getString("NAME");
					int maxCap = rs.getInt("MAX_CAPACITY");
					sb.append(roomID+"\t"+locInLib+"\t\t"+name+"\t"+maxCap+"\n");
				}
				return sb.toString();
			}
			else if(option == 3)
			{
				rs = statement.executeQuery(SelectQueries.selQuery3);
				sb.append("ROOM_ID\tCARD_NUM\tRESERVATION_START_DATE\tRESERVATION_END_DATE\n");
				while(rs.next())
				{
					int roomID = rs.getInt("ROOM_ID");
					int cardNum = rs.getInt("CARD_NUM");
					Date resStartDate = rs.getDate("RESERVATION_START_DATE");
					Date resEndDate = rs.getDate("RESERVATION_END_DATE");
					sb.append(roomID+"\t"+cardNum+"\t"+resStartDate+"\t\t"+resEndDate+"\n");
				}
				return sb.toString();
			}
			else if(option == 4)
			{
				rs = statement.executeQuery(SelectQueries.selQuery4);
				sb.append("ADDRESS_ID\tADDRESS_LINE1\tADDRESS_LINE2\tPOSTAL_CODE\tPHONE_NUMBER\tCITY\tPROVINCE\n");
				while(rs.next())
				{
					int addressID = rs.getInt("ADDRESS_ID");
					String line1 = rs.getString("ADDRESS_LINE1");
					String line2 = rs.getString("ADDRESS_LINE2");
					String postalCode = rs.getString("POSTAL_CODE");
					long phoneNum = rs.getLong("PHONE_NUMBER");
					String city = rs.getString("CITY");
					String province = rs.getString("PROVINCE");
					if(line1.length()>=15)
						sb.append(addressID+"\t"+line1+"\t"+line2+"\t\t"+postalCode+"\t\t"+phoneNum+"\t\t"+city+"\t"+province+"\n");
					else
						sb.append(addressID+"\t"+line1+"\t\t"+line2+"\t\t"+postalCode+"\t\t"+phoneNum+"\t\t"+city+"\t"+province+"\n");
				}
			}
			else if(option == 5)
			{
				rs = statement.executeQuery(SelectQueries.selQuery5);
				sb.append("ITEM_ID\tDATE_BORROWED\tDUE_DATE\tCARD_NUM\n");
				while(rs.next())
				{
					//SELECT * FROM BORROWED_ITEMS WHERE DUE_DATE = '04/10/2017'
					int itemID = rs.getInt("ITEM_ID");
					Date dateBorrowed = rs.getDate("DATE_BORROWED");
					Date dueDate = rs.getDate("DUE_DATE");
					int cardNum = rs.getInt("CARD_NUM");
					sb.append(itemID+"\t"+dateBorrowed+"\t\t"+dueDate+"\t"+cardNum+"\n");					
				}
			}
			else if(option == 6)
			{
				rs = statement.executeQuery(SelectQueries.selQuery6);
				while(rs.next())
				{
					//SELECT * FROM LIBRARY_USERS WHERE FIRST_NAME = 'Jason' ORDER BY LAST_NAME ASC;
				}
			}
			else if(option == 7)
			{
				rs = statement.executeQuery(SelectQueries.selQuery7);
				while(rs.next())
				{
					//SELECT * FROM LIBRARIANS WHERE EMPLOYEE_TYPE = 'PART-TIME' ORDER BY FIRST_NAME ASC, LAST_NAME ASC
				}
			}
			else if(option == 8)
			{
				rs = statement.executeQuery(SelectQueries.selQuery8);
				while(rs.next())
				{
					//SELECT * FROM BOOKS WHERE AUTHOR = 'J. GEORGE' OR AUTHOR='G. TOLKIEN'
				}
			}
			else if(option == 9)
			{
				rs = statement.executeQuery(SelectQueries.selQuery9);
				sb.append("TITLE\t\tAUTHOR\tPUBLISHER\tITEM_ID\n");
				while(rs.next())
				{
					String title = rs.getString("TITLE");
					String author = rs.getString("AUTHOR");
					String publisher = rs.getString("PUBLISHER");
					int itemID = rs.getInt("ITEM_ID");
					if(title.length()>=15)
						sb.append(title+"\t"+author+"\t"+publisher+"\t"+itemID+"\n");
					else
						sb.append(title+"\t\t"+author+"\t"+publisher+"\t"+itemID+"\n");
				}
			}
			else if(option == 10)
			{
				rs = statement.executeQuery(SelectQueries.selQuery10);
				while(rs.next())
				{
//					SELECT LIBRARY_CARDS.USER_ID,LIBRARY_USERS.FIRST_NAME,LIBRARY_USERS.LAST_NAME
//					FROM LIBRARY_CARDS,LIBRARY_USERS
//					WHERE EXPIRY_DATE <TO_DATE('01/01/2022','MM/DD/YYYY') AND
//					EXPIRY_DATE>TO_DATE('01/01/2017','MM/DD/YYYY')
//					AND LIBRARY_CARDS.USER_ID = LIBRARY_USERS.USER_ID
//					ORDER BY LAST_NAME ASC;
					
					
				}
			}
			else
			{
				rs = statement.executeQuery(SelectQueries.selQuery11);				
				while(rs.next())
				{
//					SELECT sr.ROOM_ID,sr.NAME
//					FROM STUDY_ROOMS sr
//					WHERE NOT EXISTS
//					(SELECT rr.ROOM_ID
//					FROM ROOM_RESERVATIONS rr
//					WHERE rr.RESERVATION_START_DATE>=TO_DATE('09/25/2017','MM/DD/YYYY')
//					AND rr.RESERVATION_END_DATE <= TO_DATE('09/30/2017','MM/DD/YYYY')
//					AND sr.ROOM_ID = rr.ROOM_ID)
//					ORDER BY NAME ASC;
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
