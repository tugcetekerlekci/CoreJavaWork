
public class Car extends Machine{
	//car is already is identical as machine. 
	
	public void wipe()
	{
		System.out.println("wind shield");
	}

	// bu bir buyuk harfle override : check if it is really overrides this function. controls its super class.
	@Override //this is an annotation.
	public void start() {
			
		System.out.println("Car is started");
	
	}
	
	

}
