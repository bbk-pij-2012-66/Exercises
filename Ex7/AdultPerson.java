public class AdultPerson implements Person {
	private int situation;
	private int energy;
	private Leg leftLeg;
	private Leg rightLeg;
	
	/**
	 * Move a distance in a straight line, given in metres
	 */
	public void move(int distance) {
		if (rightLeg.isHealthy() && leftLeg.isHealthy()) {
			System.out.println("running");
			run(distance);
		} else {
			System.out.println("walking");
			walk(distance);
		}
	}
	
	/**
	 * Say something
	 */
	public void say(String message) {
		System.out.println(message);
	}
	
	private void run(int distance) {
		situation = situation + distance;
		setEnergy(getEnergy() - 1);
	}
	
	private void walk(int distance) {
		for (int i = 0; i < distance; i++) {
			situation++;
		}
	}

	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}