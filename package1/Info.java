package package1;

public class Info
{
	public static void main(String[] args) {
		
		
		Info.collectLogs("Log1", "Log2", "Log3", "Log4");
	}
	
	public static void collectLogs(String ...data) {
			for( String i : data)
			{
				System.out.println(i);
			}
		}
	
}