//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.TreeSet;
//
//
//class Employee
//{
//	int id;
//	String name;
//	
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	
//}
//
//class sortByName implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.name.compareTo(o2.name);
//	}
//	
//}
//
//class sortById implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o2.id - o1.id;
//	}
//	
//}
//
////Can u sort the employees in ascending order of their names
//
//public class Comparision {
//
//	public static void main(String[] args) {
//
//		Employee e1 = new Employee(1, "John");
//		Employee e2 = new Employee(2, "Sam");
//		Employee e3 = new Employee(3, "Mark");
//		
//		List<Employee> al = new ArrayList<Employee>();
//		al.add(e1);
//		al.add(e2);
//		al.add(e3);
//		
//		Collections.sort(al, new sortByName());
//		
//		ArrayList names = new ArrayList(); 
//		
//		for(Employee e10 : al)
//		{
//			names.add(e10.name);
//		}
//		
//		System.out.println(names);
//		
//		Collections.sort(al, new sortById());
//		
//		ArrayList ids = new ArrayList(); 
//		
//		for(Employee e10 : al)
//		{
//			ids.add(e10.id);
//		}
//		
//		System.out.println(ids);
//		
////		Set ts = new TreeSet();
////		ts.add(100);
////		ts.add(30);
////		ts.add(60);
////		ts.add(12);
////		
////		System.out.println(ts);
//		
////		List al = new ArrayList();
////		al.add(100);
////		al.add(30);
////		al.add(60);
////		al.add(12);
////		
////		Collections.sort(al);
////		System.out.println(al);
//	}
//
//}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


class Employee implements Comparable<Employee>
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		
		return o.id - this.id;
	}
	
}


//Can u sort the employees in ascending order of their names

public class Comparision {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Sam");
		Employee e3 = new Employee(3, "Mark");
		System.out.println(e1);
		
		List<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		for( Employee e10: al)
		{
			System.out.println(e10.id);
		}
	}

}








