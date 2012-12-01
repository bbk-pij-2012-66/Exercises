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
	if (option == 1 || option == 2) {
		println "Please enter a binary number to convert:";
		String str = System.console().readLine();
	}
	switch (option) {
	case 0: running = false;
	break;
	case 1: binary2decimal();
	break;
	case 2: decimal2binary();
	break;
	default: println "Invalid option. Please try again."
}

void binary2decimal () {
	println "Changing binary to decimal"
}

void decimal2binary () {
	println "Changing decimal to binary"
}