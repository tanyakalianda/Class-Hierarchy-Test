
public class SavingsAccount extends BankAccount
{
	public final double INTEREST_RATE = 0.25;
	
	
	public void addInterest()
	{
		deposit(INTEREST_RATE * getBalance());
	}
	
}
