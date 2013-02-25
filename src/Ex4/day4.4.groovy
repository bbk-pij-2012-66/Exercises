// takes a binary number (with the digits 0 and 1)
// and returns the corresponding number in decimal
// (base-10, with digits between 0 and 9)
println "binary2decimal converter";

boolean running = true;
while (running) {
	println "What would you like to do?";
	println "1 - binary2decimal";
	println "2 - decimal2binary";
	println "0 - Exit";
	print "> ";
	String str = System.console().readLine();
	int option = Integer.parseInt(str);
	
	String stringNum = null;
	
	if (option == 1 || option == 2) {
		println "Please enter a number to convert:";
		stringNum = System.console().readLine();
		print "Converting " + stringNum;
	}
	
	switch (option) {
		case 0:
			running = false;
			break;
		case 1:
			binary2decimal(stringNum);
			break;
		case 2:
			decimal2binary(stringNum);
			break;
		default:
			println "Invalid option. Please try again."
	}
}

void binary2decimal (String stringNum) {
	// take the input and tiems each column by 2 to the power of the column
	// eg you can find that 100011 = 1 * 2^5 + 1 * 2^1 + 1 * 2^0.
	println " to decimal...";
	
	int decimal = 0;
	int numberOfDigits = stringNum.length();
	int multiplier;
	int digit;
	 
	//we need the length of the string to get the powers
	for (i = 0; i < numberOfDigits; i++) {
		// println "Char " + i + " is : " + stringNum.charAt(i);
		// println "2's column " + (numberOfDigits - i) + " is : " + stringNum.charAt(i);
		
		// digit = Integer.parseInt(Character.toString(stringNum.charAt(i)));
		digit = Character.getNumericValue(stringNum.charAt(i));
		int power = (numberOfDigits - i);
		multiplier = 1;		
		for (j = 1; j < power; j++) {
			multiplier *=2;
		} 
		// println "Char " + stringNum.charAt(i) + " times " + multiplier;
		// println "Decimalised " + digit * multiplier;
		decimal += digit * multiplier;
	}
	
	println "...the answer is " + decimal + "!"
}

void decimal2binary (String stringNum) {
	println " to binary...";
	
	int decimal = Integer.parseInt(stringNum);
	int remainder = 0;
	String str = "";
	
	// divide by 2, count the mod as the binary digit
	// each result is a char from left to right
	while (decimal != 0) {
		remainder = decimal % 2;
		decimal = decimal / 2;
		// println decimal + " remainder: " + remainder;
		str = Integer.toString(remainder) + str;		
	}
	println "...the answer is " + str + "!"
}