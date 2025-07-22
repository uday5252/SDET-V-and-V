//
//interface DBConnection{
//	abstract public void connect();
//	abstract public void insert();
//	abstract public void disconnect();
//}
//
//class MySQL implements DBConnection
//{
//
//	@Override
//	public void connect() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void insert() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void disconnect() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//class DB2 implements DBConnection{
//
//	@Override
//	public void connect() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void insert() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void disconnect() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//
//public class Interfaces {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}




interface A
{
	public void m1();
}

interface B
{
	public void m1();
	public void m2();
	public void m3();
}

class PQR
{
	public void m1()
	{
		System.out.println("PQR m1()");
	}
}

class ABC extends PQR implements A, B
{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
 
	
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	public void m1() {
		System.out.println("Interface m1 method");
		
	}
		
}


public class Interfaces {

	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.m1();
		
	}

}

