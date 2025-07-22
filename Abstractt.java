
abstract class Vehicle
{
	public void engine() {
		System.out.println("Every vehicle"
				+ " has engine!");
	}
	
	abstract public void noOfWheels();
}

class Bike extends Vehicle
{

	@Override
	public void noOfWheels() {
		System.out.println("Bike has 2 wheels");
		
	}
	
}

public class Abstractt {
	public static void main(String[] args) {
		

	}

}
