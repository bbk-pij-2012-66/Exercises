import static org.junit.Assert.*;

import org.junit.Test;


public class Ex2BookTest {

	@Test
	public void test() {
		Ex2Book testBook = new Ex2Book("Terry Pratchett", "Guards Guards");	
		String inputAuthor = testBook.getAuthor();
		String inputTitle = testBook.getTitle();
		String expectedAuthor = "Terry Pratchett";
		String expectedTitle = "Guards Guards";
		assertSame("WTF!", expectedAuthor, inputAuthor);
		assertSame("Double WTF!!", expectedTitle, inputTitle);
	}

}
