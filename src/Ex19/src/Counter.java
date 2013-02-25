package Ex19.src;

public class Counter {
	private int n = 0;
	
	public synchronized void increase() {
		n++;
	}
	
	public int getCount() {
		return n;
	}
}