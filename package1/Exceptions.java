package package1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
//		FileInputStream fis = new FileInputStream("abc.txt");
		
		
		System.out.println("Connection established!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator:-");
		int num = scan.nextInt();
		
		System.out.println("Enter the denominator:-");
		int den = scan.nextInt();
		
		try {
			System.out.println(num / den);
//			ArithmeticException
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(100 / 0);
		}
		
		finally {
			System.out.println("Connection closed!");
			scan.close();
		}
	}

}
