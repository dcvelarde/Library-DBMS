import java.sql.SQLException;
import java.sql.Statement;

public class PopulateTables {
	
	public PopulateTables()
	{
		
	}
	
	public void populateTables(Statement statement)
	{
		try
		{
			deleteExistingRecordsInTables(statement);			
			/*Populate ADDRESS*/
			statement.executeUpdate(PopulateTableQueries.populateAddress1);
			statement.executeUpdate(PopulateTableQueries.populateAddress2);
			statement.executeUpdate(PopulateTableQueries.populateAddress3);
			
			/*Populate LIBRARY_USERS*/
			
			/*Populate LIBRARIANS*/
			
			/*Populate LOCATION_IN_LIBRARY*/

			/*Populate LIBRARY_CARDS*/
			
			/*Populate ITEMS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate BORROWED_ITEMS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate RETURNED_ITEMS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate HOLD_ITEMS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate AUDIO_BOOKS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate BOOKS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate MOVIES*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate CDS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate STUDY_ROOMS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
			
			/*Populate ROOM_RESERVATIONS*/
			statement.executeUpdate(PopulateTableQueries.populateRoomReserv1);
			statement.executeUpdate(PopulateTableQueries.populateRoomReserv2);
			statement.executeUpdate(PopulateTableQueries.populateRoomReserv3);
			
			/*Populate COMPUTERS*/
			statement.executeUpdate(PopulateTableQueries.populateComp1);
			statement.executeUpdate(PopulateTableQueries.populateComp2);
			statement.executeUpdate(PopulateTableQueries.populateComp3);
						
			/*Populate COMPUTER_LOGINS*/
			statement.executeUpdate(PopulateTableQueries.populateCompLogin1);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin2);
			statement.executeUpdate(PopulateTableQueries.populateCompLogin3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void deleteExistingRecordsInTables(Statement statement) throws SQLException 
	{
		statement.executeUpdate(PopulateTableQueries.deleteCompLogins);
		statement.executeUpdate(PopulateTableQueries.deleteComp);
		statement.executeUpdate(PopulateTableQueries.deleteRoomReserv);
		statement.executeUpdate(PopulateTableQueries.deleteStudyRooms);
		statement.executeUpdate(PopulateTableQueries.deleteBorrowedItems);
		statement.executeUpdate(PopulateTableQueries.deleteReturnedItems);
		statement.executeUpdate(PopulateTableQueries.deleteHoldItems);
		statement.executeUpdate(PopulateTableQueries.deleteMovies);
		statement.executeUpdate(PopulateTableQueries.deleteCDS);
		statement.executeUpdate(PopulateTableQueries.deleteAudioBooks);
		statement.executeUpdate(PopulateTableQueries.deleteBooks);
		statement.executeUpdate(PopulateTableQueries.deleteItems);
		statement.executeUpdate(PopulateTableQueries.deleteLibCards);
		statement.executeUpdate(PopulateTableQueries.deleteLibrarians);
		statement.executeUpdate(PopulateTableQueries.deleteLibUsers);
		statement.executeUpdate(PopulateTableQueries.deleteLocInLib);
		statement.executeUpdate(PopulateTableQueries.deleteAddress);
		
	}
}
