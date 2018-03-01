import java.util.Random;

public class ThreadTester2 {

	public static void main(String[] args){
		Runnable tim = new CounterDemo2("Tim");
		Runnable jiarui = new CounterDemo2("Jiarui");
		Runnable r = new CounterDemo2("R");
		System.out.println("Call the run methods on tim and jiarui and r");
		tim.run();
		jiarui.run();
		r.run();

		Thread timThread = new Thread(tim);
		Thread jiaruiThread = new Thread(jiarui);
		Thread rThread = new Thread(r);

		System.out.println("\n\nCall the start method on the tim and jiarui and r Threads!");
		timThread.start();
		jiaruiThread.start();
		rThread.start();

    for(int i = 0; i<500; i++){
      Thread x = new Thread(new CounterDemo2("thread:"+i));
      x.start();
    }

	}
  // add the CounterDemo class but rename it Counter Demo 2
  static class CounterDemo2 implements Runnable{

  	private String name;

  	public CounterDemo2(String name){
  		this.name=name;
  	}

    // every Runnable must implement this method ...
  	// this counts to 10 with a random wait up to 1 second between each count
  	public void run(){
  		Random r = new Random();
  		try{
  			for(int i=0; i<4; i++){
  				Thread.sleep(r.nextInt(1000)); // this pauses the process for 1000 milliseconds
  				System.out.println("CounterDemo2: "+name+" step "+i);
  			}
  		} catch(InterruptedException e){
  			System.out.println("This thread was interrupted! "+e);
  		}
  	}
  }

}
