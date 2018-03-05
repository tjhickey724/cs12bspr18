import java.util.Random;

public class ThreadTester3 {
  String version = "1.0.7";
  int counter = 0;

	public static void main(String[] args){
    ThreadTester3 tt3 = new ThreadTester3();

		Runnable tim = tt3.new CounterDemo3("Tim");
		Runnable jiarui = tt3.new CounterDemo3("Jiarui");
		Runnable r = tt3.new CounterDemo3("R");

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
      Thread x = new Thread(tt3.new CounterDemo3("thread:"+i));
      x.start();
    }

	}
  // add the CounterDemo class but rename it Counter Demo 2
  class CounterDemo3 implements Runnable{

  	private String name;

  	public CounterDemo3(String name){
  		this.name=name;
  	}

    // every Runnable must implement this method ...
  	// this counts to 10 with a random wait up to 1 second between each count
  	public void run(){
  		Random r = new Random();
  		//try{
  			for(int i=0; i<4; i++){
          counter = counter + 1;
  				//Thread.sleep(r.nextInt(1000)); // this pauses the process for 1000 milliseconds
  				System.out.println(counter+" "+version+" CounterDemo3: "+name+" step "+i);
  			}
  		//} catch(InterruptedException e){
  		//	System.out.println("This thread was interrupted! "+e);
  		//}
  	}
  }

}
