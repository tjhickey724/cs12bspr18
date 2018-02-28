public class ThreadTester {

	public static void main(String[] args){
		for(int i=0; i<10;i++){
			runThread(i+ "  thread#");
		}
	}

	public static void runThread(String name){
		// create a runnable
		ThreadDemo s = new ThreadDemo(name);
		// use it to create a thread
		Thread t = new Thread(s);
		// start it running
		t.start();
	}

}
