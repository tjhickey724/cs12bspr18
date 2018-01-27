package bankdemo;

/**
		BankAccount is a class that simulates accounts in a Bank.
		Each Account has a name and a balance.
		Funds can be deposited and withdrawn from accounts and transferred
		into another account.
		The number of transactions for each account is tracked, as is the
		total number of transactions over all accounts
*/
public class BankAccount {
  private static int numBankTransactions = 0;

  private String name;
  private int balance;
  private int numAcctTransactions=0;

  /**
	create an account with a specified name and balance
	@param n the name of the account
	@param b the initial balance
	*/
  public BankAccount(String n, int b){
    this.name = n;
    this.balance = b;
  }

	/**
	create an account with the specified name
	@param n the name of the account
	*/
  public BankAccount(String n){
    this.name = n;
    this.balance = 0;
  }


  public String toString(){
    return "< "+ name + " , " + balance + " >";
  }

  private void incrementTransactions(){
    this.numAcctTransactions++;
    BankAccount.numBankTransactions++;
  }


  /**
  adds the amt to the balance field
	@param amt the amount to deposit into the account
  */
  public void deposit(int amt){
    this.balance = amt+ this.balance;
    this.incrementTransactions();
  }

  /**
  subtracts the amt from the balance field of this object
	@param amt the amount to withdraw from the account
	@throws Exception if amt to withdraw is larger than the balance
  */
  public void withdraw(int amt) throws Exception{
		if (amt>this.balance) throw new Exception("balance too low");
    this.balance -= amt;
    this.incrementTransactions();
  }

  /**
    returns the balance in the account ...
		@return the balance in the account
  */
  public int getBalance(){
    this.incrementTransactions();
    return this.balance;
  }

  /**
  transfers the amt to the specified BankAccount
	@param t the amount to transfer
	@param account the account to transfer it to
	@throws Exception if the balance is too low for the withdrawl
  */
  public void transferTo(int t, BankAccount account) throws Exception{
    this.withdraw(t);
    account.deposit(t);
  }

  /**
  returns the number of transactions on the current account
  @return TotalNumber of Transactions
  */
  public int getTransactions(){
    return this.numAcctTransactions;
  }


  /**
  sets transactions on the current account to be zero
  */
  public void clearTransactions(){
    this.numAcctTransactions = 0;
  }

  /**
  returns the number of bank transactions
  @return TotalNumber of Transactions
  */
  public static int getAllTransactions(){
    return BankAccount.numBankTransactions;
  }


  /**
  sets bank transactions to be zero
  */
  public static void clearAllTransactions(){
    BankAccount.numBankTransactions = 0;
  }




}
