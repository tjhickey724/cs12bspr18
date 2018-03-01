import java.util.Random;

public class CounterDemo implements Runnable{

	private String name;

	public static void main(String[] args){
		CounterDemo tim = new CounterDemo("tim");
		CounterDemo jiarui = new CounterDemo("jiarui");
		tim.run();
		jiarui.run();
	}

	public CounterDemo(String name){
		this.name=name;
	}

  // every Runnable must implement this method ...
	// this counts to 10 with a random wait up to 1 second between each count
	public void run(){
		Random r = new Random();
		try{
			for(int i=0; i<10; i++){
				Thread.sleep(r.nextInt(1000)); // this pauses the process for 1000 milliseconds
				System.out.println("CounterDemo: "+name+" step "+i);
			}
		} catch(InterruptedException e){
			System.out.println("This thread was interrupted! "+e);
		}

	}
}
