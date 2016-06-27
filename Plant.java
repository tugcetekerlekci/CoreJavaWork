//PUBLIC - PROTECTED - PRIVATE: 
//Private: only just in same class
//Public: Everywhere
//Protected: within the same class or within the same package, or subclass, no modifier: same package only. 

public class Plant {
	
	public String name ;
	//you should not acctually encapsulated the variables as public. 
	//the idea is encapsulate the data from outside the world. 
	public final static int ID= 8; 
	
	private String type ; // opposite to public ; you can only access it within the class. 
	protected String size;
	
	int height; // you have not classify this. 
	//this is in same the package accesiblity. 
	//same package classes can acccess; others can not
	
	public Plant()
	{
		this.name = "Batu";
		
	}

	public Plant(String name) {
	
		this.name = name;
		this.size = "large";
		this.type = "tipsiz";
	}


	
	
}
