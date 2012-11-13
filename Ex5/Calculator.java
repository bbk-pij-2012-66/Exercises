public class Calculator {
	//private double x;
	//private double y;
	
	public int choice() {
		// Gives a selection of possible parameters
		System.out.println("Please pick from one of the following:");
		System.out.println("1 For 'Adding'");
		System.out.println("2 For 'Subtracting'");
		System.out.println("3 For 'Multiplication'");
		System.out.println("4 For 'Division'");
		System.out.println("5 For 'Modulus'");
		System.out.println("0 to close...");
		
		String str = System.console().readLine();
	    Integer picked = Integer.parseInt(str);
		return picked;
	}
	
	public void add(int x, int y) {
		// Adder
		System.out.println("...                            ...");
		System.out.println("The answer for " + x + " PLUS " + y + " is " + (x + y));;
		System.out.println("...                            ...");
	}
	
	public void subtract(int x, int y) {
		// Subtractor
		System.out.println("...                            ...");
		System.out.println("The answer for " + x + " MINUS " + y + " is " + (x - y));;
		System.out.println("...                            ...");
	}
	
	public void multiply(int x, int y) {
		// Multiplier
		System.out.println("...                            ...");
		System.out.println("The answer for " + x + " TIMES " + y + " is " + (x * y));;
		System.out.println("...                            ...");
	}
	
	public void divisor(int x, int y) {
		// Division
		double total = (double) x / (double) y;
		System.out.println("...                            ...");
		System.out.println("The answer for " + x + " DIVIDED BY " + y + " is " + total);
		System.out.println("...                            ...");
	}
	
	public void mod(int x, int y) {
		// Modulus
		System.out.println("...                            ...");
		System.out.println("The answer for " + x + " MOD " + y + " is " + (x % y));
		System.out.println("...                            ...");
	}
	
	/**
	 * launching class
	 */
	public void launch() {
		System.out.println( "...                            ...");
		System.out.println( "... Calculator App is starting ...");
		System.out.println( "...                            ...");
			
		boolean finished = false;
		do {
			Calculator picker = new Calculator();
			
    	    switch ( picker.choice() ) {
    	        case 1:
    	        	// add
    	        	picker.add(this.getVal(),this.getVal());
    	        	break;  	        
    	        case 2:
    	        	// subtract
    	        	picker.subtract(this.getVal(),this.getVal());
    	           	break;
    	        case 3:
    	        	// multiply
    	        	picker.multiply(this.getVal(),this.getVal());
    	           	break;
    	        case 4:
    	        	// divide
    	        	picker.divisor(this.getVal(),this.getVal());
    	         	break;
    	        case 5:
    	        	// modulus
    	        	picker.mod(this.getVal(),this.getVal());
    	        	break;  
    	        case 0:
    	        	// finish
    	        	finished = true;
    	        	break;
    	        default:
    	        	System.out.println( "That was not a valid choice! Please try again.");
    	        	break;
    	    }
		} while (!finished);
		System.out.println("...Calculator App closing down.");	
	}
	
	public int getVal() {
       	System.out.println("Please insert number");
		return Integer.parseInt(System.console().readLine());
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
