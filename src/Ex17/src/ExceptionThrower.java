
public class ExceptionThrower {

	/**
	 * Test run for exceptions in class
	 */
	public static void main(String[] args) {
		ExceptionThrower et = new ExceptionThrower();
		et.launch();
	}

	private void launch() {
		System.out.print("Write a number: ");
		int n = getNumber();
		String isOdd = (n % 2 == 0) ? "odd" : "even";
		System.out.println("You entered " + n + ", it is " + isOdd + ".");
	}
	
	private int getNumber() {
		String str = System.console().readLine();
		int result = Integer.parseInt(str);
		return result;
	}
}
