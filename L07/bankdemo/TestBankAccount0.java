package bankdemo;

public class TestBankAccount0{
  public static void main(String[] args) throws Exception{
   BankAccount0 a1 = new BankAccount0("Tim's Gold",1000);
   BankAccount0 a2 = new BankAccount0("William's Gold");
   a2.deposit(250);
   // a1.balance = 1000000;

   System.out.println("a1="+a1);
   System.out.println("a2="+a2);


   System.out.println("\n\ndeposit 10000 into a1");
   a1.deposit(10000);
	 System.out.println("a1="+a1);
	 System.out.println("a2="+a2);


   try {
	   System.out.println("\n\nwithdraw 500 from a2");
     a2.withdraw(500);
	   System.out.println("a1="+a1);
	   System.out.println("a2="+a2);
   } catch(Exception e) {
     System.out.println("not enough money!:" + e.getMessage());
   }


	 System.out.println("\n\ntransfer 100 from a1 to a2");
   a1.transferTo(100,a2);
	 System.out.println("a1="+a1);
	 System.out.println("a2="+a2);

   /**
   System.out.println("Tim has "+a1.getBalance()+" gold pieces");
   System.out.println("Will has "+a2.getBalance()+" gold pieces");
   System.out.println("Tim has "+a1.getTransactions()+" transactions");
   System.out.println("Will has "+a2.getTransactions()+" transactions");
   System.out.println("Bank has "+BankAccount.getAllTransactions()+" transactions");
	 */
  }
}
