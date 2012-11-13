import java.io.Console;

public class Calculator {

	/**
	 * @param args
	 */

	/**
	 * launching class
	 */
	public void launch() {
		System.out.println ( "Calculator has started!" );
		System.out.println ( "Please pick from one of the following:" );
		System.out.println ( "1 For 'Adding'" );
		System.out.println ( "2 For 'Subtracting'" );
		System.out.println ( "3 For 'multiplication'" );
		System.out.println ( "4 For 'division'" );
		System.out.println ( "0 to close..." );
		
		boolean finished = false;
		
		do {
			String str = System.console().readLine();
			//System.out.println (str);
		    Integer choice = Integer.parseInt(str);
    	    switch (choice) {
    	        case 1:
    	        // add
    	        break;
    	        case 2:
    	        // subtract
    	        break;
    	        case 3:
    	        // multiply
    	        break;
    	        case 4:
    	        // divide
    	        break;
    	        case 0:
    	        //finish
    	        finished = true;
    	        break;
    	        default:
    	        System.out.println( "That was not a valid choice! Please try again." );
    	        break;
    	    } 				
		} while (!finished);
		
		System.out.println ( "Calculator App closing down..." );	
	}
	
	/**
	 * Main class for sets up new class 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator abacus = new Calculator();
		abacus.launch();
				
	}

}
