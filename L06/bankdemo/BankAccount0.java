package bankdemo;

public class BankAccount0 {

  private String name;
  private int balance;

	/**
	  create an account with the specified balance and name
	*/
  public BankAccount0(String n, int b){
    this.name = n;
    this.balance = b;
  }

	/**
	  create an account with balance 0 and the specified name n
	*/
  public BankAccount0(String n){
    this.name = n;
    this.balance = 0;
  }

	/**
	  convert the BankAccount to a meaningful String
		@return a string of the form <name,balance>
	*/
  public String toString(){
    return "< "+ name + " , " + balance + " >";
  }

	/**
	  test if the BankAccount is equal to another BankAccount b
	  @return true if the two accounts have the same balance and name
	*/
	public boolean equals(BankAccount0 b){
		return false;
	}

  /**
    adds the amt to the balance field
	  @param amt the amount to deposit into the account
  */
  public void deposit(int amt){

  }


  /**
    subtracts the amt from the balance field of this object
	  @param amt the amount to withdraw from the account
  */
  public void withdraw(int amt){

  }

  /**
    @return the balance in the account ...
  */
  public int getBalance(){
		return 0;

  }

  /**
  transfers the amt to the specified BankAccount
	@param t the amount to transfer
	@param account the bank account to transfer the funds to
  */
  public void transferTo(int t, BankAccount0 account){

  }


}
