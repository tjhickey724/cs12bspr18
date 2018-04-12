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
    for (int i=0;i<list.size(); i++){
      System.out.println(i+" "+list.get(i));
    }
    ListIterator<String> it = list.listIterator();
    while(it.hasNext()){
      it.add("x");
      it.next();
    }

    for (int i=0;i<list.size(); i++){
      System.out.println(i+" "+list.get(i));
    }
  }
}
