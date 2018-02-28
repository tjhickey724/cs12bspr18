public class ThreadDemo implements Runnable{

	private String name;

	public ThreadDemo(String name){
		this.name=name;
	}

  // every Runnable must implement this method ...
	public void run(){
		try{
			for(int i=0; i<60; i++){
				Thread.sleep(1000); // this pauses the process for 1000 milliseconds
				System.out.println(name+" step "+i);
			}
		} catch(InterruptedException e){
			System.out.println("This thread was interrupted! "+e);
		}

	}
}
