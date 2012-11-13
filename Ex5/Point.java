public class Point {
	double x;
	double y;
	
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point remote) {
		this.x = remote.x;
		this.y = remote.y;
	}
	// more methods here...
	
	public void launch() {
		Point point = new Point(1,1);
		System.out.println ( "The point is now at " + point.x + "," + point.y );
		Point remotePoint = new Point(10,18);
		point.moveTo(remotePoint);
		System.out.println ( "The point is now at " + point.x + "," + point.y );
	}

	public static void main(String[] args) {
		Point starter = new Point(0,0);
		starter.launch();
	}
}
