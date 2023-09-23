package ATM_INTERFACE;

public class Bank {

	private double balance = 2500;
	
	public double getBalance()
	{
		return balance;
	}
	
	public double withdrawMoney(int Money)
	{
		if (balance < Money) {
			System.out.println("unssufient balance");
		}
		else {
			balance -= Money;
			System.out.println("withdraw successfully");
		}	
		return balance;
	}
	public double setBalance(int Money)
	{
		balance += Money;
		return balance;
	}
}
