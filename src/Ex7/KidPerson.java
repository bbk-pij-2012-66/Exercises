public class KidPerson implements Person {
	private int position;
	private Brain brain;
	
	/**
	 * Move a distance in a straight line, given in metres
	 */
	public void move(int distance) {
		crawl(distance); // not working. homen 2nd laptop run
	}
	
	private void crawl(int distance) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Say something
	 */
	public void say(String message) {
		for (int i = 0; i < distance; i++) {
			position++;
			waitALittle();
		}
	}
	
	private String getUnderstoodWords(String text) {
		String result = "";
		String[] words = brain.divideIntoWords(text);
		for (int i = 0; i < words.length; i++) {
			if (brain.isKnown(words[i])) {
				result = result + words[i]; // if not, ignore it	
			}
		}
		return result;
	}
}