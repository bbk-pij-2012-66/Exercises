class Point {
int x;
int y;
}
// This method increments the int by 1 and
// moves the point to the right
void increment(Point point, int n) {
    n = n + 1;
    point.x = point.x + 1;
    point = null;
    println " At the end of the method..."
    println " The integer is " + n;
    println " The point is " + point;
}
// Program execution starts here
Point myPoint = new Point();
myPoint.x = 0;
myPoint.y = 0;
int myInt = 0;
println "The integer is now " + myInt;
println "The point is now " + myPoint.x + "," + myPoint.y;
println "Calling method increment(Point, int)..."
increment(myPoint, myInt);
println "The integer is now " + myInt;
println "The point is now " + myPoint.x + "," + myPoint.y;