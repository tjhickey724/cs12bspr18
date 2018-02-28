public class Counter {
  public static void main(String[] args){
    long i=0;
    runThread("Tim");
    while(true){
      i++;
      if (i%1000000000==0){
        System.out.println(i);
      }
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
