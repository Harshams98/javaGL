package assignment;

public class Bank {
	
	static int update() {
		return ++Account.rate;
	}
	
public static void main(String[]args) {
	Account[] obj =new Account[2];
	
	obj[0]=new SavingsAccount();
	obj[1]=new CurrentAccount();
	update();
	obj[0].interstcal(update());
	
	obj[1].interstcal(update());
	obj[1].withdraw(1028.0);
	obj[1].deposite(10222.9);
	
	
	
}
}
class Account{
	public static int simpleintrest,rate,principle=120000,time=1;
	double bal=10000;
	void interstcal(int rate) {
		System.out.println("the bank intrest");
	}
		
	void withdraw(double amount) {
		
		
	}
	void deposite(double amount) {
	
		}
	
}
class SavingsAccount extends Account{
	
	void interstcal(int rate) {
		super.rate=rate;
		simpleintrest=(principle*rate*time);
		System.out.println("Total intrest savings account = "+simpleintrest);
		
	}
}
class CurrentAccount extends Account{
	void interstcal(int rate) {
		super.rate=rate;
		simpleintrest=(principle*rate*time);
		System.out.println("Total intrest current account = "+simpleintrest);
		
	}

	void withdraw(double amount) {
		if(amount>bal) {
			System.out.println("Bank balance is low overdraft");
		}
		else {
			bal=bal-amount;
			System.out.println("total balance="+bal);
		}
		
	}
	void deposite(double amount) {
	
			bal=bal+amount;
			System.out.println("total balance="+bal);
		}
		
	
	
}