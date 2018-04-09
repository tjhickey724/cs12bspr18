import java.util.*;

public class TimeLists{

  public static void main(String[] args){
    List<Integer> bigAlist = new ArrayList<Integer>();
    List<Integer> bigLlist = new LinkedList<Integer>();
    for(int i=0;i<1000000;i++){
      bigAlist.add(i);
      bigLlist.add(i);
    }

    for (int i=0; i<40; i++) {
      double t1= timeCreateList("ArrayList",10000*i);
      double t2 = timeCreateList("LinkedList",10000*i);
      double t3 = timeAccessList("ArrayList",bigAlist,10000*i);
      double t4 = timeAccessList("LinkedList",bigLlist,10000*i);
      System.out.println("\nArrayList/LinkedList insertion at front: "+t1/t2);
      System.out.println("LinkedList/ArrayList random access: "+t4/t3+"\n\n");
    }



  }

  public static double timeCreateList(String listType, int size){
    ArrayList<Integer> alist =  new ArrayList<Integer>();
    LinkedList<Integer> blist = new LinkedList<Integer>();
    List<Integer> list;
    if (listType.equals("ArrayList")){
      list = alist;
    } else {
      list = blist;
    }
    long start = System.nanoTime();
    for(int i=0; i<size; i++){
      list.add(0,i); //list.size()/2,i);
    }
    long finish = System.nanoTime();
    double seconds = (finish-start)/1000000000.0;
    System.out.printf(
    "adding %d numbers to front of %s takes %f seconds\n",size,listType,seconds);
    return seconds;
  }

  public static double timeAccessList(String listType,List<Integer>list, int steps){
    long start = System.nanoTime();
    int sum=0;
    for(int i=0; i<steps; i++){
      sum += list.get(i);
    }
    long finish = System.nanoTime();
    double seconds = (finish-start)/1000000000.0;
    System.out.printf(
    "accessing %d numbers in %s takes %f seconds\n",steps,listType,seconds);
    return seconds;
  }
}
