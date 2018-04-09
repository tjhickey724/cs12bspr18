import java.util.ListIterator;

/**
 * This provides a doubly linked list implementation of the ListA interface
 */

public class LinkedListA<E> {
  Node<E> start;
  int size=0;

  public LinkedListA(){
  }

  public void add(int index, E element){
    Node<E>n;
    if (start==null){
      if (index>0) return;
      n = new Node<E>();
      n.value = element;
      start = n;
      n.prev =null;
      n.next=null;
    } else {
      n = start;
      for(int i=0; i<index-1; i++){
        n = n.next;
        System.out.printf("%d %s\n",i,n);
      }
      Node<E> m = new Node<E>();
      m.value = element;
      m.prev=n;
      m.next= n.next;
      if (n.next != null)
         n.next.prev = m;
      n.next = m;
    }
    size++;
    System.out.println(n);
    return;
  }

  public void clear(){
    return;
  }

  public boolean contains(E element){
    return false;
  }

  public E get(int index){
    Node<E> n = start;
    for(int i=0; i<index; i++){
      n = n.next;
    }
    return n.value;
  }

  public int indexOf(Object o){
    return -1;
  }

  public boolean isEmpty(){
    return true;
  }

  public ListIterator<E> iterator(){
    return new LinkedListAIterator<E>(this);
  }

  public E remove(int index){
    return null;
  }

  public E set(int index, E element){
    return null;
  }

  public int size(){
    return this.size;
  }
  public Object[] toArray(){
    return null;
  }




}
