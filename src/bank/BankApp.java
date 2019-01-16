package bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);

		Bankaccount account = new Bankaccount();

		while (true) {

			System.out.print("Insättning eller uttag (0-insättning, 1-uttag): ");
			int x = reader.nextInt();

			if (x == 0) {
				System.out.print("Ange belopp: ");
				account.credit(reader.nextInt());
				System.out.println("Saldo: " + account.funds());
				
				System.out.print("Vill du avsluta? Ja eller Nej: ");
				if (reader.next().equalsIgnoreCase("Ja"))
					break;
			}

			else if (x == 1) {
				System.out.print("Ange ett belopp: ");
				account.withdraw(reader.nextInt());
				System.out.println("Saldo: " + account.funds());
				
				System.out.print("Vill du avsluta? Ja eller Nej: ");
				if (reader.next().equalsIgnoreCase("Ja"))
					break;
			}

			else {
				System.out.println("Var vänlig och ange en giltig tjänst.");
			}
		}
		System.out.print("Välkommen åter!");
	}
}
