public class ThreadTester {

	public static void main(String[] args){
		Runnable tim = new CounterDemo("Tim");
		Runnable jiarui = new CounterDemo("Jiarui");
		Runnable r = new CounterDemo("R");
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
	}


}
