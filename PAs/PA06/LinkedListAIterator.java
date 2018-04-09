import java.util.ListIterator;



public class LinkedListAIterator<E> implements ListIterator<E>{
  private LinkedListA<E> list;
  private int currentIndex=0;
  private Node<E> currentPosition = list.start;

  public LinkedListAIterator(LinkedListA<E> list){
    this.list = list;
  }

  public void add(E e){
    return;
  }

  public boolean hasNext(){
    return false;
  }

  public boolean hasPrevious(){
    return false;
  }

  public E next(){
    return null;
  }

  public int nextIndex(){
    return -1;
  }

  public E previous(){
    return null;
  }

  public int previousIndex(){
    return -1;
  }

  public void remove(){
    return;
  }

  public void set(E element){
    return;
  }

  public Object[] toArray(){
    return null;
  }

}
