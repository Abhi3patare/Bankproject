package Bank;


import java.util.Scanner;

class Bankaccount{
	int balance;
	String customername;
	String customerid;
	
	Bankaccount(String cname,String cid){
		customername=cname;
		customerid=cid;
	}
	
	
	
	
	void deposit(int amount) {
		if(amount != 0) {
			balance= balance+amount;
			
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance= balance-amount;
		}
		
		
	}
	
	void Menu() {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		 
		
		System.out.println("Welcome"+customername);
		System.out.println("ID :"+customerid);
		System.out.println("\n");
		
		System.out.println("1: check balance");
		System.out.println("2: Deposit");
		System.out.println("3: Withdraw");
		System.out.println("4: Exit");
		
		do {
			System.out.println("Enter option");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Balance:"+balance);
				break;
			case 2:
				System.out.println("enter amount to deposit");
				int amount=sc.nextInt();
				deposit(amount);
				System.out.println(amount+" "+"deposited succesfully!");
				break;
			case 3:
			     System.out.println("enter amount to withdraw");
			     int amount2=sc.nextInt();
			     withdraw(amount2);
			     System.out.println(amount2+" "+"withdraw succesfully");
			     break;
			case 4:  
				System.out.println("--------------------------------------");
				break;
			default:
				System.out.println("Invalid option");
			break;
		}
			
	} while (choice != 4);
		System.out.println("Thank you");
	}
	
}
public class Bankingapp{
	public static void main(String[] args) {
		Bankaccount bacc=new Bankaccount("ABHISHEK", "101");
		bacc.Menu();
	}
	
	
	
}

