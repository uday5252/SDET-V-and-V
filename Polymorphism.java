
//class Calculatorr
//{
//	public void add(int num1, int num2)
//	{
//		System.out.println(num1 + num2);
//	}
//	
//	public void add(int num1, int num2, int num3)
//	{
//		System.out.println(num1 + num2 + num3);
//	}
//	
//	public void add(int num1, float num2)
//	{
//		System.out.println(num1 + num2);
//	}
//}
//
//public class Polymorphism {
//
//	public static void main(String[] args) {
//		
//		Calculatorr c =  new Calculatorr();
//		c.add(10, 20);
//
//	}
//}
//
//
////checks the program ==> Compiler
////run the program ==> JVM



class Animal
{
	static public void bark()
	{
		System.out.println("Animal Barks!");
	}
}

class Dog extends Animal
{
	static public void bark()
	{
		System.out.println("Dog Barks as bow bow..!");
	}
}

class Cat extends Animal
{
	static public void bark()
	{
		System.out.println("Cat Barks as ..!");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.bark();

	}
}


//checks the program ==> Compiler
//run the program ==> JVM




