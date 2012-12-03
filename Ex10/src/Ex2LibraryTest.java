import static org.junit.Assert.*;

import org.junit.Test;


public class Ex2LibraryTest {

	@Test
	public void test() {
		Ex2Library testLibrary = new Ex2Library("The Legend");	
		
		String inputUser = testLibrary.getUser();
		String expectedUser = "The Legend";
		assertSame("WTF!", expectedUser, inputUser);
		
		int inputID = testLibrary.getLibraryID();
		int expectedID = 0;
		assertSame("Double WTF!!", expectedID, inputID);
		
		testLibrary.setLibraryID(123);
		inputID = testLibrary.getLibraryID();
		expectedID = 123;
		assertSame("Triple WTF!!!", expectedID, inputID);
		
	}

}
