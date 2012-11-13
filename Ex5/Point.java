public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	void moveTo(Point remote) {
		this.x = remote.x;
		this.y = remote.y;
	}
	// more methods here...
	
	public void launch() {
		Point point = new Point(1,1);
		System.out.println ( "The point is now at " + point.getX() + "," + point.getY() );
		Point remotePoint = new Point(10,18);
		point.moveTo(remotePoint);
		System.out.println ( "The point is now at " + point.getX() + "," + point.getY() );
	}

	public static void main(String[] args) {
		Point starter = new Point(0,0);
		starter.launch();
	}
}
