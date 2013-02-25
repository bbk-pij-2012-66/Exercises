/**
 * 
 * @author bmajev01
 *
 * Book class for day 10 Exercise 2.1
 */
public class Ex2Book {
	private final String author;
	private final String title;
	
	/**
	 * Constructor for this class requires the following parameters
	 * 
	 * @param newAuthor
	 * @param newTitle
	 */
	public Ex2Book(String newAuthor, String newTitle) {
		this.author = newAuthor;
		this.title = newTitle;
	}
	
	/**
	 * Returns the Author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	 * Returns the Title
	 * 
	 * @return
	 */
	public String getTitle() {
		return this.title;
	}
}

