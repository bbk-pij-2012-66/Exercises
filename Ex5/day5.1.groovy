

public class Calculator {
    /*
    int x;
    int y;
    */
    
    /*
    println("Give me 1st number");
    s = System.console().readLine();
    x = Integer.parseInt(s);
    println("Give me 2nd number");
    s = System.console().readLine();
    y = Integer.parseInt(s);
    */
    public getNum() {
    println("Give me a number");
    s = System.console().readLine();
    num = Integer.parseInt(s);
    return num;
    }
   
    public add(int x, int y) {
//        total = this.x + this.y
        //Calculator getX = new Calculator();
        //x = getX.getNum;
        //Calculator getY = new Calculator();
        //y = getY.getNum;
        println "The sum of these numbers is: " + (x+y);  
        //return (x + y);
    }
}

Calculator calc = new Calculator();
boolean running = true;
    while (running) {
        println "What would you like to do?";
        println "1 - Add";
        println "2 - Subtract";
        println "3 - Multiply";
        println "4 - Divide"
        println "5 - Modulus";
        println "0 - Exit";
        print "> ";
        
        String str = System.console().readLine();
        int option = Integer.parseInt(str);
        
        int x, y
        if (option!= 0) { 
            println("Give me 1st number");
            s = System.console().readLine();
            x = Integer.parseInt(s);
            println("Give me 2nd number");
            s = System.console().readLine();
            y = Integer.parseInt(s);
        }
        
        switch (option) {
        case 0: running = false;
        break;
        case 1:calc.add(x,y);
            //println "The sum of these numbers is: " + calc.add(x,y);
        break;
        case 2: deleteUser();
        break;
        case 3: createUser();
        break;
        case 4: deleteUser();
        break;
        case 5: createUser();
        break;
        default: println "Invalid option. Please try again."
    }
}

