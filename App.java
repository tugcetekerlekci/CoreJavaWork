//import ocean.Fish;
//import ocean.Seaweed;
import ocean.Fish;
import ocean.Seaweed;
//command shift o gerekli butun packageleri import eder. 
import ocean.plant.Alg;

public class App {

	public static void main(String[] args)
	{
		Machine m1= new Machine();
		m1.start();
		m1.stop();
		
		Car c1 = new Car();
		
		c1.start();
		c1.wipe();
		c1.stop();
		
		Fish fish = new Fish();
		Seaweed weed = new Seaweed();
		Alg a = new Alg();
		
		Machine mach1 =  new Machine();
		mach1.start();
		
		Person person1 = new Person("Tugce");
		person1.greet();
		
		Info info1 =new Machine();
		info1.showInfo(); //sadece bu methoda ulasabilirsin. Interfacete tanimli methodlara ulasabilirsin bu sekilde.
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);
		
		
	
	}
	//create a method with Info type
	
	private static void outputInfo(Info info)
	{
		info.showInfo();
		
		
	}

}
