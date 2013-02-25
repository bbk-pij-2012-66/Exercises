//day3_2
//Write a program that reads a text representing a mathematical operation (one of the four basic ones)
//with two operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”;
//if the user enters “23 * 4” the program outputs “92”..
int num1, num2
double total
String s
println "Please key in 2 numbers with an operation (eg 23*4): "
if s.
s = System.console().readLine()
num1 = Integer.parseInt(s)
num2 = Integer.parseInt(s)
println num1 + " and " + num2
boolean finished = false
while (!finished) { 
    //println "Now choose an operation to perform: "
    //println "For 'Adding', please enter 1"
    //println "For 'Subtracting', please enter 2"
    //println "For 'multiplication', please enter 3"
    //println "For 'division', please enter 4"
    //s = System.console().readLine()
    //Integer choice = Integer.parseInt(s)
    switch (choice) {
        case '+':
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