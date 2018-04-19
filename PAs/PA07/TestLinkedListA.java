import java.util.ListIterator;

public class TestLinkedListA {
  public static void main(String[] args){
    LinkedListA<String> list = new LinkedListA<String>();
    list.add(0,"a");
    list.add(1,"b");
    list.add(0,"c");
    list.add(1,"d");
    list.add(2,"e");
    list.add(0,"f");
    list.add(4,"g");
    list.debugPrint();
    for (int i=0;i<list.size(); i++){
      System.out.println(i+" "+list.get(i));
    }
    ListIterator<String> it = list.listIterator(list.size());
    while(it.hasPrevious()){
      //it.add("x");
      String s = it.previous();
      System.out.println(it.previousIndex()+" "+s+" "+it.nextIndex()+" ");
      it.set(s+"!");
      if (s.equals("a")) {
        it.remove();
      }
    }

    while(it.hasNext()){
      System.out.println("adding x: list size = "+list.size());
      list.debugPrint();
      it.add("x");
      System.out.println("added x: list size = "+list.size());
      list.debugPrint();
      System.out.println(it.previousIndex()+" "+"x"+" "+it.nextIndex()+" ");
      String s = it.next();
      System.out.println(it.previousIndex()+" "+s+" "+it.nextIndex()+" ");
      list.debugPrint();
      System.out.println("******");
      it.set(s+"?");
      if (s.equals("e!")) {
        System.out.println("removing e!");
        System.out.println("list size = "+list.size());
        list.debugPrint();
        it.remove();
        System.out.println("list size = "+list.size());
        list.debugPrint();
      }
    }
    System.out.println("list size = "+list.size());
    list.debugPrint();
    System.out.println("list size = "+list.size());
    for (int i=0;i<list.size(); i++){
      System.out.println(i+" "+list.get(i));
    }
  }
}
