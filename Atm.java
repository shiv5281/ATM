import java.util.Scanner;
public class Atm
{
	public static void main(String args[])
	{
		System.out.println("*** Welcome To XXX ATM *** \n");
		int balance=10000,withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to check balance:\n ");
		System.out.println("Enter 2 to Withdraw:\n ");
		System.out.println("Enter 3 to Deposit:\n ");
		System.out.println("Enter 4 to Exit: \n");

			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Balance = "+balance);
					System.exit(0);
				case 2:
					System.out.println("Enter the Amount to Withdraw: ");
				       	withdraw = sc.nextInt();
					if(balance >= withdraw)
					{
						withdraw=balance-withdraw;
						System.out.println("Your Withdraw was successful");
						System.out.println("Your Balance after Withdraw is :"+withdraw);
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
					System.out.println("");
					System.exit(0);
					
				case 3:
					System.out.println("Enter the Amount to Deposit: ");
				        deposit=sc.nextInt();
					deposit=balance+deposit;
					System.out.println("Your Balance after Deposit is "+deposit);
					System.out.println("");
					System.exit(0);
					
				case 4:
					System.out.println(" *** Thank You ! Visit Again ***");
					System.exit(0);
		
			}
	}
}



/* Created By SHIVA */
