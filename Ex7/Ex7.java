
public class Ex7 {

	public void launch() {
		AdultPerson Jimbo = new AdultPerson();
		Jimbo.setLeftLeg(true);
		Jimbo.setRightLeg(true);
		Jimbo.say("Howdy Stranger");
		Jimbo.move(20);
		System.out.println("finished");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7 starter = new Ex7();
		starter.launch();
	}

}
