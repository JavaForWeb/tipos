package bo.gob.asfi.tipos.BankDemo;

/**
 * Created by fernando on 10/13/16.
 */
public class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
