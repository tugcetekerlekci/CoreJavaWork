
public class Machine implements Info {
	
	private String name="I am a machine"; //it is declared because it is only accesible by the class. 
	
	private int id = 7; 
	
	
	public void start(){
		System.out.println("Machine started");
		
	}
	
	public void stop(){
		System.out.println("Machine stopped");
		
	}

	
	public void showInfo() {
		System.out.println("Machine id is" + id);
		
	}

}
