//day3_3
//Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it.
//Your program should output the correct change specifying the amount of notes (50, 20, 10, 5) and 
//coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.
String s
double num1
int fifties, twenties, tenners, fivers
println "Please input the total cost of your purchases"
s = System.console().readLine()
num1 = Double.parseDouble(s)
boolean finished = false
fifties = 0
tester = num1
while (tester >= 50) {
    fifties++
    tester -= 50
}
num1 -= fifties * 50

twenties = 0
tester = num1
while (tester >= 20) {
    twenties++
    tester -= 20
}
num1 -= twenties * 20

tenners = 0
tester = num1
while (tester >= 10) {
    tenners++
    tester -= 10
}
num1 -= tenners * 10

fivers = 0
tester = num1
while (tester >= 5) {
    fivers++
    tester -= 5
}
num1 -= fivers * 5

println "you need " + fifties + " fifties."
println "you need " + twenties + " twenties."
println "you need " + tenners + " tenners."
println "you need " + fivers + " fivers."

//new line to test commit
