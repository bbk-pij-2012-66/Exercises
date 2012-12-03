public class Book {
	private final String author;
	private final String title;
	
	public Book(String newAuthor, String newTitle) {
		this.author = newAuthor;
		this.title = newTitle;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
}

