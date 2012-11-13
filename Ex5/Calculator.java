public class Calculator {
	private double x;
	private double y;
	
	public int getX() {
		return (int) x;
	}
	
	public int getY() {
		return (int) y;
	}
	
	public void setX() {
       	System.out.println("Please insert the first number");
		String str = System.console().readLine();
	    Integer num1 = Integer.parseInt(str);
		this.x = num1;
	}
	
	public void setY() {
    	System.out.println("Please insert the second number");
		String str = System.console().readLine();
	    Integer num2 = Integer.parseInt(str);
		this.y = num2;
	}
	
	public int choice() {
		// Gives a selection of possible parameters
		System.out.println("Please pick from one of the following:");
		System.out.println("1 For 'Adding'");
		System.out.println("2 For 'Subtracting'");
		System.out.println("3 For 'Multiplication'");
		System.out.println("4 For 'Division'");
		System.out.println("0 to close...");
		
		String str = System.console().readLine();
	    Integer picked = Integer.parseInt(str);
		return picked;
	}
	
	public void add(int x, int y) {
		// Adder
		System.out.println ( "...                            ..." );
		System.out.println("The answer for " + x + " PLUS " + y + " is " + (x + y));;
		System.out.println ( "...                            ..." );
	}
	
	public void subtract(int x, int y) {
		// Subtractor
		System.out.println ( "...                            ..." );
		System.out.println("The answer for " + x + " MINUS " + y + " is " + (x - y));;
		System.out.println ( "...                            ..." );
	}
	
	public void multiply(int x, int y) {
		// Subtractor
		System.out.println ( "...                            ..." );
		System.out.println("The answer for " + x + " TIMES " + y + " is " + (x * y));;
		System.out.println ( "...                            ..." );
	}
	
	/**
	 * launching class
	 */
	public void launch() {
		System.out.println ( "...                            ..." );
		System.out.println ( "... Calculator App is starting ..." );
		System.out.println ( "...                            ..." );
		boolean finished = false;
		do {
			Calculator picker = new Calculator();
			
    	    switch ( picker.choice() ) {
    	        case 1:
    	        	// add
     	    	    picker.setX();
     	    	    picker.setY();
    	        	picker.add(picker.getX(), picker.getY());
    	        	break;  	        
    	        case 2:
    	        	// subtract
     	    	    picker.setX();
     	    	    picker.setY();
    	        	picker.subtract(picker.getX(), picker.getY());
    	           	break;
    	        case 3:
    	        	// multiply
     	    	    picker.setX();
     	    	    picker.setY();
    	        	picker.subtract(picker.getX(), picker.getY());
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
		System.out.println ( "...Calculator App closing down." );	
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
