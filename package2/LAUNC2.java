package package2;

import package1.A;

class D extends A
{
	public void print() {
		System.out.println(pub);
		System.out.println(pro);
	}
}

class E{
	public void print()
	{
		A a = new A();
		System.out.println(a.pri);
		System.out.println(a.pub);
		System.out.println(a.def);
		System.out.println(a.pro);
	}
}

public class LAUNC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
