public class SinglyLinkedList {
  Node list;

  public static void main(String[] args){
    SinglyLinkedList alist = new SinglyLinkedList();
    for(int i=0; i<100; i++){
      alist.add(i);
    }
    alist.printList();
    System.out.println("19th elt is "+alist.get(19));
  }

  public SinglyLinkedList(){
    this.list = null;
  }

  public int get(int k){
    Node n = this.list;
    for(int i=0; i<k; i++){
      n = n.next;
    }
    return n.value;
  }

  public void add(int x){
    Node n = new Node();
    n.value = x;
    n.next = this.list;
    this.list = n;
  }

  public void printList(){
    Node n = this.list;
    while (n!=null){
      System.out.print(n.value+" ");
      n = n.next;
    }
  }


  static class Node{
    int value;
    Node next;
  }
}
