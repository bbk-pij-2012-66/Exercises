public class Person {
	private final String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() { // missing opening brace
		return this.name;
	}
	
	/*
	public void setName(String name) {
		this.name = name; // final so can't change name
	}
	*/
}