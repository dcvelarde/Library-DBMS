import java.sql.Statement;

public class DropTables {
	
	private final String dropAddressQuery = "DROP TABLE ADDRESS";
	private final String dropLibUsersQuery = "DROP TABLE LIBRARY_USERS";
	private final String dropLibrariansQuery = "DROP TABLE LIBRARIANS";
	private final String dropLILQuery = "DROP TABLE LOCATION_IN_LIBRARY";
	private final String dropLibraryCardsQuery = "DROP TABLE LIBRARY_CARDS";
	private final String dropItemsQuery = "DROP TABLE ITEMS";
	private final String dropBorrowedItemsQuery = "DROP TABLE BORROWED_ITEMS";
	private final String dropHoldItemsQuery = "DROP TABLE HOLD_ITEMS";
	private final String dropReturnedItemsQuery = "DROP TABLE RETURNED_ITEMS";
	private final String dropBooksQuery = "DROP TABLE BOOKS";
	private final String dropAudioBooksQuery = "DROP TABLE AUDIO_BOOKS";
	private final String dropMoviesQuery = "DROP TABLE MOVIES";
	private final String dropCDsQuery = "DROP TABLE CDS";
	private final String dropStudyRoomsQuery = "DROP TABLE STUDY_ROOMS";
	private final String dropRoomReservationsQuery = "DROP ROOM_RESERVATIONS";
	private final String dropComputersQuery = "DROP TABLE COMPUTERS";
	private final String dropComputerLoginsQuery = "DROP TABLE COMPUTER_LOGINS";
	
	
	

	public DropTables()
	{
		
	}
	
	public void dropTables(Statement statement)
	{
		try
		{
			statement.executeUpdate(dropAddressQuery);
			statement.executeUpdate(dropLibUsersQuery);
			statement.executeUpdate(dropLibrariansQuery);
			statement.executeUpdate(dropLILQuery);
			statement.executeUpdate(dropLibraryCardsQuery);
			statement.executeUpdate(dropItemsQuery);
			statement.executeUpdate(dropBorrowedItemsQuery);
			statement.executeUpdate(dropHoldItemsQuery);
			statement.executeUpdate(dropReturnedItemsQuery);
			statement.executeUpdate(dropBooksQuery);
			statement.executeUpdate(dropAudioBooksQuery);
			statement.executeUpdate(dropMoviesQuery);
			statement.executeUpdate(dropCDsQuery);
			statement.executeUpdate(dropStudyRoomsQuery);
			statement.executeUpdate(dropRoomReservationsQuery);
			statement.executeUpdate(dropComputersQuery);
			statement.executeUpdate(dropComputerLoginsQuery);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
