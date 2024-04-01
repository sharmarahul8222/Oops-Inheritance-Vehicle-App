
public class Main {

	public static void main(String[] args) {
		//For Car
		SUV s= new SUV("Fortuner", "White", 2024, false);
		 s.move(10); 
		 s.accelerate(49); 
		 s.accelerate(-59);
		System.out.println("Name of Car is "+s.getName()+ " type is " +s.getType()+ " and colour is " +s.getColour());
		
		//For Scooter
		TwoWheeler tw= new TwoWheeler("Bajaj", "Black", 1996, false);
		tw.move(10);
		tw.accelerate(20);
		tw.accelerate(-30);
		System.out.println("Name of Scooter is "+tw.getName()+ " type is " +tw.getType()+ " and colour is " +tw.getColour());
	}

}
