
public class SelectQueries 
{
	public static final String selQuery1="SELECT * FROM COMPUTER_LOGINS WHERE LOG_IN_START_DATE >=TO_TIMESTAMP('2017-09-27','YYYY-MM-DD')";
	public static final String selQuery2="SELECT * FROM STUDY_ROOMS WHERE MAX_CAPACITY >=5";
	public static final String selQuery3="SELECT * FROM ROOM_RESERVATIONS WHERE RESERVATION_START_DATE >=TO_TIMESTAMP('2017-09-26','YYYY-MM-DD') AND RESERVATION_END_DATE<TO_TIMESTAMP('2017-09-29','YYYY-MM-DD')";
	public static final String selQuery4="SELECT * FROM ADDRESS WHERE CITY = 'TORONTO'";
	public static final String selQuery5="SELECT * FROM BORROWED_ITEMS WHERE DUE_DATE = '04/10/2017'";
	public static final String selQuery6="SELECT * FROM LIBRARY_USERS WHERE FIRST_NAME = 'Jason' ORDER BY LAST_NAME ASC;";
	public static final String selQuery7="SELECT * FROM LIBRARIANS WHERE EMPLOYEE_TYPE = 'PART-TIME' ORDER BY FIRST_NAME ASC, LAST_NAME ASC";
	public static final String selQuery8="SELECT * FROM BOOKS WHERE AUTHOR = 'J. GEORGE' OR AUTHOR='G. TOLKIEN'";
	public static final String selQuery9="SELECT * FROM STUDY_ROOMS WHERE MAX_CAPACITY >=5";
	public static final String selQuery10="SELECT LIBRARY_CARDS.USER_ID,LIBRARY_USERS.FIRST_NAME,LIBRARY_USERS.LAST_NAME"
											+"FROM LIBRARY_CARDS,LIBRARY_USERS"
											+"WHERE EXPIRY_DATE <TO_DATE('01/01/2022','MM/DD/YYYY') AND"
											+"EXPIRY_DATE>TO_DATE('01/01/2017','MM/DD/YYYY')"
											+"AND LIBRARY_CARDS.USER_ID = LIBRARY_USERS.USER_ID"
											+"ORDER BY LAST_NAME ASC";
	public static final String selQuery11="SELECT sr.ROOM_ID,sr.NAME"
											+"FROM STUDY_ROOMS sr"
											+"WHERE NOT EXISTS"
											+"(SELECT rr.ROOM_ID"
											+"FROM ROOM_RESERVATIONS rr"
											+"WHERE rr.RESERVATION_START_DATE>=TO_DATE('09/25/2017','MM/DD/YYYY')"
											+"AND rr.RESERVATION_END_DATE <= TO_DATE('09/30/2017','MM/DD/YYYY')"
											+"AND sr.ROOM_ID = rr.ROOM_ID)"
											+"ORDER BY NAME ASC";

}