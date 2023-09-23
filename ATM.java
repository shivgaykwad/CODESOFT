package ATM_INTERFACE;
import java.util.Scanner;

public class ATM extends Bank {
	
public static void main(String[] args) {
	System.out.println("Welcome to ATM");
	ATM A = new ATM();
	
}
	public static void home()
	{
		Scanner sc = new Scanner(System.in);
		Bank bk = new Bank();
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for Check A/C balance");
		System.out.println("Enter 2 for Withdraw the Money");
		System.out.println("Enter 3 for Deposite the Money");
		
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1 : System.out.println("Check A/C balance");
		System.out.println(bk.getBalance());
			break;
		case 2 :
		System.out.println("Enter amount:");
		int money = sc.nextInt();
		bk.withdrawMoney(money);
		System.out.println("Total balance ="+ bk.getBalance());
			break;
		case 3 : System.out.println("Deposite Money");
		System.out.println("Enter amount:");
		int money1 = sc.nextInt();
		System.out.println( bk.setBalance(money1));
			
			System.exit(0);
		default:System.out.println("Invalid choice!!!!");
			home();
		         break;
		}
	}
	ATM(){
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		System.out.println("Please Enter your pin...");
		int userpin = sc.nextInt();
		if (pin == userpin) {
			home();
		} else {
			System.out.println("Plz Enter valid pin \n your Pin was wrong!!! ");
		}
		
	}

}
