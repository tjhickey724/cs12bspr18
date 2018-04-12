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
    ListIterator it = this.listIterator(index);
    it.add(element);
  }

  public void clear(){
    return;
  }

  public boolean contains(E element){
    return false;
  }

  public E get(int index){
    ListIterator it = this.listIterator(index));
    return it.next();
  }

  public int indexOf(Object o){
    return -1;
  }

  public boolean isEmpty(){
    return true;
  }

  public ListIterator<E> listIterator(int position){
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
