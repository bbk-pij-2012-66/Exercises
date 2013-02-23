public class AdultPerson implements Person {
	private int situation;
	private int energy;
	private boolean leftLeg;
	private boolean rightLeg;
	
	/**
	 * @return the situation
	 */
	public int getSituation() {
		return situation;
	}

	/**
	 * @param situation the situation to set
	 */
	public void setSituation(int situation) {
		this.situation = situation;
	}

	/**
	 * @return the rightLeg
	 */
	public boolean isRightLeg() {
		return rightLeg;
	}

	/**
	 * @param rightLeg the rightLeg to set
	 */
	public void setRightLeg(boolean rightLeg) {
		this.rightLeg = rightLeg;
	}

	/**
	 * @return the leftLeg
	 */
	public boolean isLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(boolean leftLeg) {
		// TODO Auto-generated method stub
		this.leftLeg = leftLeg;
	}
	
	/**
	 * Move a distance in a straight line, given in metres
	 */
	public void move(int distance) {
		
		//rightLeg.setPeg(true);
		//leftLeg.setPeg(true);
		if (isLeftLeg() && isRightLeg()) {
			System.out.println("running");
			//run(distance);
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