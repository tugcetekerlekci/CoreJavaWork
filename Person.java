
public class Person implements Info {

	private String name;
	
	
	public Person(String name) {
		super();
		this.name = name;
	}


	public void greet()
	{
		System.out.println("Hi there! ");
	}


	@Override
	public void showInfo() {
		System.out.println("Person name is " + name);
		
	}
	
	
}
