package package1;

class InsufficentFundsException extends Exception{
	

	
	public InsufficentFundsException(String message)//"Insufficent funds!"
	{
//		message = "Insufficent funds!"
//		super("Inssufient funds")
		super(message);
	}
	
}

class SavingsAccount
{
	private int balance;

	public SavingsAccount(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withdrawAmount(int recievedAmount) throws Exception
	{
		if(recievedAmount > balance)
		{
//			System.out.println("Insufficent funds!");
//			we will throw an exception / generate an exception
//			throw keyword
			throw new InsufficentFundsException("Insufficent funds!");
		}
		this.balance = this.balance - recievedAmount;
		System.out.println("The total balance is "+this.balance);
	}
	
	
}

public class Exception2 {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount(1000);
		try {
			account.withdrawAmount(200);
		}
		catch(Exception e)
		{
//			send a message to customer tellinf
//			insufficient funds error
			System.out.println(e.getMessage());
		}
//		store that debit info in a log file
//		send a SMS to that customer
	}
}

//Exeption class
