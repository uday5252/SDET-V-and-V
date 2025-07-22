//
////Parent
//class A{
//	public void method1() {
//		System.out.println("I am from method!");
//	}
//}
//
//// Child
//class B extends A{
//	public void method2() {
//		System.out.println("I am from method2");
//	}
//}
//
//public class Inheritance1 {
//	public static void main(String[] args) {
//		
//		B b = new B();
//		b.method2();
//		b.method1();
//	}
//}



//class Parent
//{
//	public void property() {
//		System.out.println("Has a property of 10 lakhs!");
//	}
//}
//
//class Child extends Parent
//{
//	public void property() {
//		System.out.println("Has a property of 20 lakhs!");
//	}
//}
//
//
//public class Inheritance1 {
//	public static void main(String[] args) {
//		Child c = new Child();
//		c.property();
//	}
//}








//class A
//{
//	public void display() {
//		System.out.println("I am from display "
//				+ "method of class A");
//	}
//}
//
//class B 
//{
//	public void display() {
//		System.out.println("I am from display "
//				+ "method of class B");
//	}
//}
//
//class C extends A, B
//{
//	
//}
//
//public class Inheritance1 {
//	public static void main(String[] args) {
//		
//		C c = new C();
//	}
//}


//class A
//{
//	A(){
//		System.out.println("A class consturctor");
//	}
//}
//
//class B extends A
//{
//	
//	B(){
//		super();
//		System.out.println("B class consturctor");
//	}
//}
//
//public class Inheritance1 {
//public static void main(String[] args) {
//	
//	B b = new B();
//}
//}




//class Person
//{
//	String name;
//	int age;
//	String city;
//	
//	public Person(String name, int age, String city) {
//		this.name = name;
//		this.age = age;
//		this.city = city;
//	}
//	
//	public void displayDetails() {
//		System.out.println("The name is "+this.name);
//		System.out.println("The age is "+this.age);
//		System.out.println("The city is "+this.city);
//	}
//}
//
//class Employee extends Person
//{
//	
//	String jobRole;
//	String companyName;
//
//	public Employee(String name, int age, String city, String jobRole, String companyName) {
////		here i want those 3 lines
//		super(name, age, city);
//		this.jobRole = jobRole;
//		this.companyName = companyName;
//	}
//	
//	public void displayEmployeeDetails() {
//		super.displayDetails();
//		System.out.println("The job role is "+this.jobRole);
//		System.out.println("The company name is "+this.companyName);
//	}
//	
//	
//}
//
//
//public class Inheritance1 {
//	
//public static void main(String[] args) 
//{
//	var e = new 
//			Employee("Raju", 34, "Pune", "Tester", "IBM");
//	e.displayEmployeeDetails();
//}
//	}


//class Student
//{
//	final static String SCHOOLNAME = "ABC High School";
//}
//
//
//public class Inheritance1 {
//	
//public static void main(String[] args) 
//{
//	Student s = new Student();
//	s.SCHOOLNAME = "XYZ High School";
//	System.out.println(s.SCHOOLNAME);
//	
//	}
//}


//class A
//{
//	final public void display()
//	{
//		System.out.println("I am from display method");
//	}
//}
//
//class B extends A
//{
//	
//}
//
//public class Inheritance1 {
//	
//public static void main(String[] args) 
//{
//	B b = new B();
//	b.display();
//	}
//}


//final class A
//{
//	final public void display()
//	{
//		System.out.println("I am from display method");
//	}
//}
//
//class B extends A
//{
//	
//}
//
//public class Inheritance1 {
//	
//public static void main(String[] args) 
//{
//	B b = new B();
//	b.display();
//	}
//}









