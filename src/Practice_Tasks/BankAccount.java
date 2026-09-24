package Practice_Tasks;

public class BankAccount {
	
	int accountNumber;
	String customerName;
	String accountType;
	double balance;
	
	BankAccount(int accountNumber,String customerName,String accountType,double balance){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
		
		}

	public static void main(String[] args) {
		
		
		BankAccount b=new BankAccount(101,"varsha","Personal acc",3500);
		
		System.out.println("Account Details of person 1");
		System.out.println(b.accountNumber);
		System.out.println(b.customerName);
		System.out.println(b.accountType);
		System.out.println(b.balance);
		
		System.out.println("");
		
		
		BankAccount b1=new BankAccount(105,"somu","Personal acc",6500);
		
		System.out.println("Account Details of person 2");
		System.out.println(b1.accountNumber);
		System.out.println(b1.customerName);
		System.out.println(b1.accountType);
		System.out.println(b1.balance);
		
		}

}
