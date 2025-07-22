//HashSet ==> It doesn't store duplicate values

import java.util.HashSet;
import java.util.Objects;

class Book
{
	int id;
	
	public Book(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book secondBook = (Book)obj;
        return this.id == secondBook.id;
    }
	
	@Override
	 public int hashCode()
	 {
		 return Objects.hash(id);
	 }
	
	
}

public class Confusion {
	public static void main(String[] args) {
		
		Book b1 = new Book(100);
		Book b2 = new Book(100);
//		System.out.println(b1.hashCode());
//		System.out.println(b2.hashCode());
		
//		System.out.println(b1 == b2);
//		System.out.println(b1.equals(b2));//compare address
		
		HashSet<Book> hs =
				new HashSet<Book>();
		
		hs.add(b1);
		hs.add(b2);
		System.out.println(hs);
		
//		int i1 = 100;
//		int i2 = 200;
//		int i3 = 100;
//		
////		Content Comparison
//		System.out.println(i1 == i2);
//		System.out.println(i1 == i3);
//		
		String s1 = new String("Raju");
		String s2 = new String("Raju");
		String s3 = new String("John");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//		System.out.println(s1);
		
//		HashSet<String> hs =
//				new HashSet<String>();
//		hs.add(s1);
//		hs.add(s2);
//		hs.add(s3);
//		System.out.println(hs);
		
//		Address Compraison
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
	}

}
