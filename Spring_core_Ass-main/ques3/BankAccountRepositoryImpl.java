package springs.ques3;


public class BankAccountRepositoryImpl implements BankAccountRepository{
	private double balance; 
	private BankAccount accountId;
	
	public BankAccount getAccountId() {
		return accountId;
	}

	public void setAccountId(BankAccount accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	@Override
	public double getBalance(BankAccount accountId) {
		// TODO Auto-generated method stub
		return getBalance();
	}

	@Override
	public double updateBalance(BankAccount  accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}

}
