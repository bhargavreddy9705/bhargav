package samplebank;

public class bankdemo {
	
	public static void main (String[] args)
	{
		//obj by using constructor with argument
		Account account1 = new Account("Raja,"saving",5000);
				
				System.out.println(account1.getDetails());
		System,out.println("Withdraw money");
		boolean value = account1.withdraw(6000);
		if (value)//inside if block programmers can pass boolean values
		{
			System.out.println(account1.getdetails());
		}
		else		
	}
System.err.println("insufficient balance..");
}
