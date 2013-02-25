/**
* A person is defined by movements (as opposed to plants)
* and by speech (as opposed to animals).
*/

public interface Person {
	/**
	 * Move a distance in a straight line, given in metres
	 */
	void move(int distance);
	
	/**
	 * Say something, printing it on the screen.
	 * It may or may not be a perfect transcription
	 */
	void say(String message);
}