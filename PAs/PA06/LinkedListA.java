import java.util.ListIterator;

/**
 * This provides a doubly linked list implementation of the ListA interface
 */

public class LinkedListA<E> {
  Node start;

  public LinkedListA(){
  }

  public void add(int index, E element){
    return;
  }

  public void clear(){
    return;
  }

  public boolean contains(E element){
    return false;
  }

  public E get(int index){
    return null;
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

  public Object[] toArray(){
    return null;
  }


  class Node<T> {
    T value;
    Node next, prev;
  }


}
