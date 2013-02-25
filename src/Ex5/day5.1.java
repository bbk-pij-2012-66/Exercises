

public class Calculator {
      
    public add(int x, int y) {
        System.out.println ("The sum of these numbers is: " + (x+y));  
    }
}

Calculator calc = new Calculator();
boolean running = true;
    while (running) {
        System.out.println("What would you like to do?");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Modulus");
        System.out.println("0 - Exit");
        System.out.println("> ");
        
        String str = System.console().readLine();
        int option = Integer.parseInt(str);
        
        int x, y
        if (option!= 0) { 
            System.out.println("Give me 1st number");
            s = System.console().readLine();
            x = Integer.parseInt(s);
            System.out.println("Give me 2nd number");
            s = System.console().readLine();
            y = Integer.parseInt(s);
        }
        
        switch (option) {
        case 0: running = false;
        break;
        case 1:calc.add(x,y);
            //println "The sum of these numbers is: " + calc.add(x,y);
        break;
        case 2: //deleteUser();
        break;
        case 3: //createUser();
        break;
        case 4: //deleteUser();
        break;
        case 5: //createUser();
        break;
        default: System.out.println("Invalid option. Please try again.");
    }
}

