package jpmc;
 public class BankAccount{
private double balance;
public BankAccount(double initialBalance) {
	this.balance = initialBalance;
}
public void deposit(double amount) {
	balance +=amount;
	System.out.println("Deposited:$" + amount);
}
public void withdraw(double amount) {
	if(balance>= amount) {
		balance -= amount;
		System.out.println("Withdraawn:$" + amount);
		}
	else {
		System.out.println("Insufficient balance");
	}
}
public void checkBalance() {
	System.out.println("Current balance:$" + balance);
	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(1000);
		account.checkBalance();
		account.deposit(500);
		account.checkBalance();
		account.withdraw(200);
		account.checkBalance();
		account.withdraw(2000);
	}
}
 
