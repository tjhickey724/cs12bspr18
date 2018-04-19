import java.util.ListIterator;

/**
 * This provides a doubly linked list implementation of the ListA interface
 */

public class LinkedListA<E> {
  Node<E> start;
  int size=0;

  public LinkedListA(){
    // create the header node
    start = new Node<E>();
    start.prev=null;
    start.next=null;
  }

  public void add(int index, E element){
    ListIterator<E> it = this.listIterator(index);
    it.add(element);
  }

  public void clear(){
    start.next = null;
    return;
  }

  public boolean contains(E element){
    ListIterator it = this.listIterator(0);
    while(it.hasNext()){
      if (it.next().equals(element)) {
        return true;
      }
    }
    return false;
  }

  public E get(int index){
    ListIterator<E> it = this.listIterator(index);
    return it.next();
  }

  public int indexOf(Object o){
    int index = 0;
    ListIterator<E> it = this.listIterator(0);
    while(it.hasNext()){
      if (it.next().equals(o)) {
        return index;
      } else {
        index++;
      }
    }
    return -1;
  }

  public boolean isEmpty(){
    return start.next == null;
  }

  public ListIterator<E> listIterator(int position){
    return new LinkedListAIterator<E>(this,position);
  }

  public E remove(int index){
    ListIterator<E> it = this.listIterator(index);
    E val = it.next();
    it.remove();
    return val;
  }

  public E set(int index, E element){
    ListIterator<E> it = this.listIterator(index);
    E val = it.next();
    it.set(element);
    return val;
  }

  public int size(){
    return this.size;
  }
  public Object[] toArray(){
    Object[] array = new Object[this.size];
    int pos=0;
    ListIterator<E> it = this.listIterator(0);
    while(it.hasNext()){
      array[pos++] = it.next();
    }
    return array;
  }

  public void debugPrint(){
    Node<E> n = this.start;
    int i=-1;
    System.out.println(i+"-- "+n.toStringZ());
    while(n.next!= null){
      i++;
      n = n.next;
      System.out.println(i+"-- "+n.toStringZ());
    }
  }



}
