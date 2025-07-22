
class VendingMachine
{
	static String brandName = "Pepsi";
	String drinkName;
	
	public VendingMachine(String drinkName) {
		super();
		this.drinkName = drinkName;
	}
	
	public static void displayBrandName()
	{
		System.out.println(brandName);
	}
	
	public void displayDrinkName()
	{
		System.out.println(this.drinkName);		
	}

}

public class Staticc {

	public static void main(String[] args) {
		
		VendingMachine v1 = new VendingMachine("Sprite");
		VendingMachine v2 = new VendingMachine("Coco cola");
		VendingMachine v3 = new VendingMachine("Mountain");
		
		VendingMachine.displayBrandName();

		v1.displayDrinkName();		
		v2.displayDrinkName();
		v3.displayDrinkName();

	}
}

//Raju ==> My country is India
//
//Mary ==> My country is China


