import java.io.IOException;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MyCustomSorting implements Comparator<Integer>
{
	20, 2, 50, 90, 10

	2, 20
	
	@Override
	public int compare(Integer num1, Integer num2) {
//		num1 = 20
//		num2 = 2
		return num1 - num2;
	}
	
}

public class Launchh {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		NavigableSet<Integer> marks = new TreeSet<Integer>(new MyCustomSorting());
		marks.add(20); // add()  ==> compare()
		marks.add(2); // add() ==> compare()
		marks.add(50);
		marks.add(90);
		marks.add(13);
		
//		System.out.println(marks);
				
		
//		"AAA", "BBB", "DDD", "EEE", "CCC"
		
		
//		sort objects based on  names in descending order
//		NavigableSet<Integer> students = new TreeSet<Integer>(new MyCustomSorting());
//		marks.add(new Student(1, "Raju"));
//		marks.add(new Student(2, "Mary"));
//		marks.add(new Student(3, "Sam"));
	}

//}


//List al = new ArrayList();
//al.add(10);
//al.add(20);
//al.add(30);
//al.add(20);
//al.add("Raju");
//al.add(true);

//al.add(2, 100);
//al.set(2, 100);
//al.remove("Raju");
//al.remove(2);//remove(indexno)
//System.out.println(al.contains("Ramu"));
//al.addFirst("100");
//al.addLast("900");
//al.clear();
//al.indexOf("Raju");
//al.size();

//System.out.println(al);


//ArrayList al1 = new ArrayList();
//Collections.synchronizedList(al1);
//al1.add(10);
//al1.add(20);
//al1.add(30);
//
//ArrayList al2 = (ArrayList) al1.clone();
//System.out.println(al1);
//System.out.println(al2);
//
////FileOutputStream fos = 
////		new FileOutputStream("C:\\Users\\udayk\\Spring\\FirstProject\\data.ser");
////
////ObjectOutputStream oos = 
////		new ObjectOutputStream(fos);
////
////oos.writeObject(al1);
////System.out.println("Data written successfully!");
////
////FileInputStream fis =
////        new FileInputStream("C:\\Users\\udayk\\Spring\\FirstProject\\data.txt");
////
////ObjectInputStream ois =
////        new ObjectInputStream(fis);
////
////List al2 = (List) ois.readObject();
////
////System.out.println("Data read successfully!");
////System.out.println("Contents of the list: " + al2);

//Youtube => Instagram ==> Linkedin

//Stack s = new Stack();
//s.push("Youtube");
//s.push("Instagram");
//s.push("Linked");

//System.out.println(s.peek());
//s.pop();
//System.out.println(s.peek());


//ArrayList<String> data = new ArrayList<String>();
//data.add("A...");
//data.add("A...");
//data.add(100);



//HashSet hs = new HashSet();
//hs.add(100);
//hs.add(300);
//hs.add(400);
//hs.add(400);
//hs.add(20);
//hs.add("Raju");
//
//System.out.println(hs);

//SortedSet ts = new TreeSet();
//ts.add(10);
//ts.add(40);
//ts.add(4);
//ts.add(400);
//System.out.println(ts);

//NavigableSet ts = new TreeSet();
//ts.add(10);
//ts.add(40);
//ts.add(4);
//ts.add(400);
//System.out.println(ts);

//NavigableSet<Integer> marks = new TreeSet<Integer>();
//marks.add(89);
//marks.add(45);
//marks.add(34);
//marks.add(78);
//marks.add(100);
//
////lowest to highest marks
//System.out.println(marks);
//
////lowest mark that student got
//System.out.println(marks.first());
//
////highes mark that student got
//System.out.println(marks.last());
//
////passing marks in various subjects that student got
//System.out.println(marks.higher(35));
//
////passing marks in various subjects that student got
//System.out.println(marks.tailSet(35));
//
//
////passing marks in various subjects that student got
//System.out.println(marks.lower(35));
//
////passing marks in various subjects that student got
//System.out.println(marks.headSet(35));


