import java.util.Deque;
import java.util.LinkedList;

public class Queuees {

	public static void main(String[] args) {
		
//	   Queue pq 
//		=new PriorityQueue();
//
//	   pq.add(100);
//	   pq.add(50);
//	   pq.add(150);
//	   pq.add(25);
//	   pq.add(75);
//	   pq.add(125);
//	   pq.add(175);
//	   System.out.println(pq);
		
		
		Deque ll = new LinkedList();
		ll.add(100);
		ll.add(300);
		ll.addFirst("Raju");
		ll.addLast("Mary");
		
		System.out.println(ll);
	}

}
