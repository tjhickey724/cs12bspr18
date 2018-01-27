package bankdemo;
/**
  This class is used for testing the BankAccount class.
	The main method invokes a few tests.
*/
public class TestBankAccount{

	/**
	  run a few tests of the BankAccount constructors and methods.
		@param args the string arguments passed into the call
		@throws Exception if one of the bankaccount methods is improperly called
	*/
  public static void main(String[] args) throws Exception{
   BankAccount a1 = new BankAccount("Tim's Gold",1000);
   BankAccount a2 = new BankAccount("William's Gold");
   a2.deposit(250);
   // a1.balance = 1000000;

   System.out.println("a1="+a1);
   System.out.println("a2="+a2);


   System.out.println("\n\ndeposit 10000 into a1");
   a1.deposit(10000);
	 System.out.println("a1="+a1);
	 System.out.println("a2="+a2);


	 System.out.println("\n\nwithdraw 50 from a2");
   a2.withdraw(50);
	 System.out.println("a1="+a1);
	 System.out.println("a2="+a2);


	 System.out.println("\n\ntransfer 10000 from a1 to a2");
   a1.transferTo(10000,a2);
	 System.out.println("a1="+a1);
	 System.out.println("a2="+a2);

   /**
   System.out.println("Tim has "+a1.getTransactions()+" transactions");
   System.out.println("Will has "+a2.getTransactions()+" transactions");
   System.out.println("Bank has "+BankAccount.getAllTransactions()+" transactions");
	 */
  }
}
