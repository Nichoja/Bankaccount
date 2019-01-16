package bank;

public class Bankaccount {

	private double balance;

	public Bankaccount() {
		balance = 0;
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double funds() {
		return balance;
	}
}
