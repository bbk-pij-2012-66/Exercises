//day1_3
String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
    i++;
    String newstr = System.console().readLine()
    int j = Integer.parseInt(newstr)
    if (j == 0) {
        break;
    } else if (j != 1) {
        println j;
    }
}
System.out.println("finished");
//while loop only runs when i is less then 10
//whilst i is less then 10 it takes an unput and increments
//if loop input is 0 it breaks the loop
//if loop input is not equal to 1 it prints the number