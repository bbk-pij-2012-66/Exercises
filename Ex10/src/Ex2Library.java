/**
 * 
 * @author bmajev01
 *
 * Library class for day 10 Exercise 2.2
 */
public class Ex2Library {
	private final String userName;
	private int libraryID;
	
	/**
	 * Constructor for this class requires the following parameters
	 * 
	 * @param String newUserName
	 */
	public Ex2Library(String newUserName) {
		this.userName = newUserName;
	}
	
	/**
	 * Method for setting library ID
	 * 
	 * @param int newLibraryID
	 */
	public void setLibraryID(int newLibraryID) {
		this.libraryID = newLibraryID;
	}
	
	/**
	 * Returns the Author
	 * 
	 * @return String
	 */
	public String getUser() {
		return this.userName;
	}
	
	/**
	 * Returns the Library ID
	 * 
	 * @return Integer
	 */
	public int getLibraryID() {
		return this.libraryID;
	}
}

