package package1;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
//		1st way
//		Raju ==> store the marks
//		int marks[] = { 40, 65, 98, 89 };
		
//		for loop
//		for(int i = 0; i < 4; i++)
//		{
//			System.out.println(marks[i]);
//		}
		
//		for each loop
//		for(int i : marks)
//		{
//			System.out.println(i);
//		}
		
//		2nd ways
//		i want to store 5 marks of Raju
		
//		int marks[] = { 40, 65, 98, 89 };
		
//		VS
		
		int marks[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the english marks:");
		int englishMark = scan.nextInt();
		marks[0] = englishMark;
		
		System.out.println("Enter the maths marks:");
		int mathsMark = scan.nextInt();
		marks[1] = mathsMark;
		
		marks[2] = 54;
		marks[3] = 90;
		marks[4] = 45;
		
		for(int mark : marks)
		{
			System.out.println(mark);
		}
	}

	
//	Array with some elements, find the sum of
//	the 2 larget elements
	
}
