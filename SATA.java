import java.util.HashSet;
import java.util.Objects;

class Student extends Object
{
	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
}

public class SATA {
	public static void main(String[] args) {
	
		Student s1 = new Student(100, "Raju");
		Student s2 = new Student(100, "Raju");
		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs);
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
//		System.out.println(s1.equals(s2));
	}
}
