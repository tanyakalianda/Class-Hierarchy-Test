
public class BankAccount 
{
	private double balance;       //needs to be private for encapsulation
	
	
	public BankAccount()
	{
		balance = 0;
	}
	
	
	public void deposit(double amount)
	{
		balance = balance + amount;      //or balance += amount;
	}
	
	public void withdrawal(double amount)
	{
		balance = balance - amount;     //or balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
