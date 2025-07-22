package package1;

public class A
{
	private int pri = 10;
	public int pub = 20;
	protected int pro = 30;
	int def = 40;
}

class B extends A
{
	public void print()
	{
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);	
	}
}

class C
{
	public void print()
	{
		A a = new A();
		System.out.println(a.pro);
		System.out.println(a.pub);
		System.out.println(a.def);
		
	}
}

class LAUNCH1 {
	public static void main(String[] args) {

		C c = new C();
		c.print();
		
	}
}
