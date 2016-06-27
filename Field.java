
public class Field {
	
	Plant plant = new Plant();
	public Field(){
		//size is protected and field is in the same package with Plant. 
		//evertything in the same package is accesible if they're protected. 
		System.out.println(plant.size);
		
		
	}

}
