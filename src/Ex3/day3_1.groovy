//day3_1
//Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
//addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu,
//the calculator performs the operation.
//Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou-
//ble.parseDouble() method to parse real numbers.
int num1, num2
double total
String s
println "Please key in a number: "
s = System.console().readLine()
num1 = Integer.parseInt(s)
println "And another: "
s = System.console().readLine()
num2 = Integer.parseInt(s)
//println num1 + " and " + num2
boolean finished = false
while (!finished) { 
    println "Now choose an operation to perform: "
    println "For 'Adding', please enter 1"
    println "For 'Subtracting', please enter 2"
    println "For 'multiplication', please enter 3"
    println "For 'division', please enter 4"
    s = System.console().readLine()
    Integer choice = Integer.parseInt(s)
    switch (choice) {
        case 1:
        // add
        total = num1 + num2
        finished = true
        break;
        case 2:
        // subtract
        total = num1 - num2
        finished = true
        break;
        case 3:
        // multiply
        total = num1 * num2
        finished = true
        break;
        case 4:
        // divide
        total = num1 / num2
        finished = true
        break;
        default:
        // go and talk with a human operator
        println "That was not a valid choice! Please try again."
        break;
    }
}
println total