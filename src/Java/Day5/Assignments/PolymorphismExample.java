package Java.Day5.Assignments;

/*
	Create class for Account 
	Create class for Savings Account 
	Create class for Current Account 
	In the Entry class create a function for WithdrawAmount() 
	In the Entry class create a function for Make Payment() 
	In the WithdrawAmount function Add charges to withdraw only if it is a current account. Extra 10% 
	Your account class will have double Balance; -> property 
	Add a property in Current account “ExtraCharges”.  
	when withdraw amount . If its current account Also add from       ExtraCharges and print it.  
	
	create class Account 
	sub class --> savings account
	sub class --> current account  
	
 */

class Account {
	// double balance = 1000; 
	static double balance = 1000;
	
	void BalanceAmountAfterWithdraw() {
		System.out.println("Balance in Account : " + balance);
	}
	
	void BalanceAmountAfterPayment() {
		System.out.println("Balance in Account : " + balance);
	}
}

class SavingsAccount extends Account {
	
	void BalanceAmountAfterWithdraw() {
		balance = balance - 100;
		System.out.println("Balance after withdraw in Savings Account : " + balance);
	}
	
	void BalanceAmountAfterPayment() {
		balance = balance + 200;
		System.out.println("Balance after payment in Savings Account : " + balance);
	}
}

class CurrentAccount extends Account {
	double ExtraCharges = 10.0;
	
	void BalanceAmountAfterWithdraw() {
		balance = balance - 100.0 - (100.0 * ExtraCharges)/100;
		System.out.println("Balance after withdraw in Current Account : " + balance);
	}
	void BalanceAmountAfterPayment() {
		balance = balance + 200.0;
		System.out.println("Balance after payment in Current Account : " + balance);
	}
}

public class PolymorphismExample {
	
	public static void WithdrawAmount(Account acc) {
		acc.BalanceAmountAfterWithdraw();
	}
	
	public static void MakePayment(Account acc) {
		acc.BalanceAmountAfterPayment();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is just for a polymorphism concept demonstration");
		Account acc = new Account();
		WithdrawAmount(acc);
		MakePayment(acc);
		
		SavingsAccount sa = new SavingsAccount();
		WithdrawAmount(sa);
		MakePayment(sa);
		
		CurrentAccount ca = new CurrentAccount();
		WithdrawAmount(ca);
		MakePayment(ca);	
	}
}