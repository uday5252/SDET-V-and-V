package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
//		ct ==> looks ct
//		[ct] ==> looks for c or t
//		Pattern regexPattern = 
//		Pattern.compile("[r-zA-F]");
		
//		Pattern regexPattern = 
//				Pattern.compile("[^a-z]");

		
//		Pattern regexPattern = 
//				Pattern.compile("[^r-zA-F]");
		
//		Pattern regexPattern = 
//				Pattern.compile("[A-Z]", Pattern.CASE_INSENSITIVE);
		
//		Pattern regexPattern = 
//				Pattern.compile("[^A-Z]", Pattern.CASE_INSENSITIVE);
//
//		Pattern regexPattern = 
//				Pattern.compile("[^A-Za-z]");

//		Pattern regexPattern = 
//				Pattern.compile("[0-9]");
		
//		Pattern regexPattern = 
//				Pattern.compile("[^0-9]");

//		
//		Matcher matcher = regexPattern
//				.matcher("Cat r34t 67_mat");
		
		
//		while(matcher.find())
//		{
//			System.out.println(matcher.start() 
//					+ ":" + matcher.group());
//}
		
//		Write a Regular Expression to check whether
//		a mobile number is valid or not
		
//		10 digits ==? 1st digit ==> 6 to 9
		
//		Pattern regex = Pattern.compile("[6-9][0-9][0-9]"
//				+ "[0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		
//		Pattern regex = Pattern.compile("[6-9][0-9]{9}");
//		Matcher matcher = regex.matcher("9113239065");

//		[0-9] ==> \d
		
//		Pattern regex = Pattern.compile("[6-9]\\d{9}");
//		Matcher matcher = regex.matcher("111323906");
//
//		boolean result = matcher.find();
//		System.out.println(result);
		
		
		
		
		
//		? ==> zero time or 1 time
//		* ==> zero time or any no of times
//		+ ==> 1 time and any no of time
//		{n} ==> n no of time
//		{m, n} ==> {2, 6} ==> min 2 and max 6
		
//		Pattern regexPattern = 
//				Pattern.compile("colou{1,5}r");
//
//		
//		Matcher matcher = regexPattern
//				.matcher("color or colour or colouur"
//						+ " colouuur colur both are valid");
//		
//		
//		while(matcher.find())
//		{
//			System.out.println(matcher.start() 
//					+ ":" + matcher.group());
//}
		
		
//		Pattern regexPattern = 
//				Pattern.compile("^(http|https)"
//						+ "://(www\\.)?[a-z0-9-]+\\.[a-z]{2,6}$");
//
//		
//		Matcher matcher = regexPattern
//				.matcher("https://www.google.com");
//		
//		
//		System.out.println(matcher.find());
//		
//	
////		Pattern regexPattern = 
////				Pattern.compile("H.*3");
//		
////		Pattern regexPattern = 
////				Pattern.compile("H..l.");
//
//		
//		Matcher matcher = regexPattern
//				.matcher("Hello123");
//		
//		System.out.println(matcher.find());
			
		
		
		
//		Pattern regexPattern = 
//		Pattern.compile("The name are (\\w+) and (\\w+)");
//
//
//	Matcher matcher = regexPattern
//			.matcher("The name are Raju and Ramu");
//	
//	
//	while(matcher.find())
//	{
//		System.out.println(matcher.start() 
//				+ ":" + matcher.group(1));
//		System.out.println(matcher.start() 
//				+ ":" + matcher.group(2));
//	}
		
//		Pattern regexPattern = 
//		Pattern.compile("The date is (\\d{2})/(\\d{2})/(?:\\d{4})");
//
//
//	Matcher matcher = regexPattern
//			.matcher("The date is 03/10/2024");
//	
//	
//	while(matcher.find())
//	{
//		System.out.println(matcher.start() 
//				+ ":" + matcher.group(1));
//		System.out.println(matcher.start() 
//				+ ":" + matcher.group(2));
//		System.out.println(matcher.start() 
//				+ ":" + matcher.group(3));
//	}
	
		
//		Pattern regexPattern = 
//				Pattern.compile("<h1>(.*)</h1>");
//
//
//			Matcher matcher = regexPattern
//					.matcher("<h1>Welcome to Regex</h1>");
//			
//			
//			while(matcher.find())
//			{
//				System.out.println(matcher.start() 
//						+ ":" + matcher.group(1));
//			}
		
		
//		Pattern regexPattern = 
//				Pattern.
//				compile("\\[\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}] ERROR - Invalid Credentials");
//
//
//			Matcher matcher = regexPattern
//					.matcher("[2025-07-19 14:55:23] ERROR - Invalid Credentials");
//			
//			
//			while(matcher.find())
//			{
//				System.out.println(matcher.start() 
//						+ ":" + matcher.group(1));
//				System.out.println(matcher.start() 
//						+ ":" + matcher.group(2));
//				System.out.println(matcher.start() 
//						+ ":" + matcher.group(3));
//			}
		
		
//			\\b ==> word boundary
//				Pattern regexPattern = 
//				Pattern.
//				compile("job");
//
//
//			Matcher matcher = regexPattern
//					.matcher("job job jobless is Raju wants to get job");
//			
//			
//			while(matcher.find())
//			{
//				System.out.println(matcher.start() 
//						+ ":" + matcher.group());
//
//			}
		
		
		
		
		Pattern regexPattern = 
				Pattern.
				compile("<h1>.+?</h1>");


			Matcher matcher = regexPattern
					.matcher("<h1>Raju</h1><h1>Ramu</h1><h1>Mary</h1>");
			
			
			while(matcher.find())
			{
				System.out.println(matcher.start() 
						+ ":" + matcher.group());

			}
		
		
		
		
		
		
		
		
	}

}
