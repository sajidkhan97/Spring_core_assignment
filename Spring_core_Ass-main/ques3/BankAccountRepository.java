package springs.ques3;

public interface BankAccountRepository {
	public double getBalance(BankAccount accountId);
	public double updateBalance(BankAccount  accountId,double newBalance);
}
