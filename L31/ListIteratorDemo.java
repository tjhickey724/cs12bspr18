import java.util.*;
public class ListIteratorDemo {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    ListIterator<String> it = list.listIterator();
    initialize(it);
    print(list);
    removeAlternates(list.listIterator());
    print(list);
  }

  private static void print(LinkedList<String> list){
    System.out.print("[");
    for(String s: list){
      System.out.print(s+",");
    }
    System.out.println("]");
  }

  private static void removeEveryOther(ListIterator<String> it){
    int pos=0;
    while(it.hasNext()){
      it.next();
      if (pos%2==1) it.remove();
      pos++;
    }
  }

  private static void initialize(ListIterator<String> it){
    for(int i=0; i<15; i++){
      it.add("a"+i);
    }
  }
}
