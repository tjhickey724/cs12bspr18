import java.util.Random;

public class ThreadTester4 {
  String version = "1.0.7";
  int counter = 0;

	public static void main(String[] args){

    for(int i = 0; i<500; i++){
      Thread x = new Thread(
        new Drawable(){
          public void run(){
        		Random r = new Random();

        			for(int i=0; i<4; i++){
                counter = counter + 1;
        				System.out.println(counter+" "+version+" CounterDemo4: "+"thread"+" step "+i);
        			}
            }
          }
        );

      x.start();
    }

	}

}
