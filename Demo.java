
public class Demo {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 20);
	}
}


class Calculator
{
	public void add(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, int num2, int num3)
	{
		System.out.println(num1 + num2 + num3);
	}
	
	public void add(float num1, float num2)
	{
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, float num2)
	{
		System.out.println(num1 + num2);
	}
}













