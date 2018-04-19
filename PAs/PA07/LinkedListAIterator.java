import java.util.ListIterator;



public class LinkedListAIterator<E> implements ListIterator<E>{
  private LinkedListA<E> list;
  private int currentIndex=0;
  private Node<E> currentPosition;
  private boolean forward=true; // which direction are we moving ..

  public LinkedListAIterator(LinkedListA<E> list,int pos){
    this.list = list;
    this.currentIndex=0;
    currentPosition = this.list.start;
    for(int i=0; i<pos; i++){
      currentPosition = currentPosition.next;
      this.currentIndex++;
    }

  }

  public void add(E e){
    System.out.println("ADDING "+e+" to list at "+currentPosition.toStringZ());
    this.list.debugPrint();
    Node<E> node = new Node<E>();
    node.value = e;
    node.prev = currentPosition;
    node.next = currentPosition.next;
    node.prev.next = node;
    if (node.next != null){
      node.next.prev = node;
    }

    currentPosition = node;
    //System.out.println("after add "+currentPosition.toStringZ());

    currentIndex++;
    this.list.size++;
    System.out.println("ADDED "+e+" to list at "+currentPosition.toStringZ());
    this.list.debugPrint();
    return;
  }

  public boolean hasNext(){
    return currentPosition.next != null;
  }

  public boolean hasPrevious(){
    return currentPosition.prev != null;
  }

  public E next(){
    currentPosition = currentPosition.next;
    currentIndex++;
    forward = true;
    return currentPosition.value;
  }

  public int nextIndex(){
    if (forward){
      return currentIndex;
    } else {
      return currentIndex+1;
    }

  }

  public E previous(){
    forward = false;
    E val = currentPosition.value;
    currentPosition = currentPosition.prev;
    currentIndex--;
    return val;
  }

  public int previousIndex(){
    if (forward){
      return currentIndex-1;
    } else {
      return currentIndex;
    }

  }

  public void remove(){
    if (forward){
      currentPosition.prev.next = currentPosition.next;
      if (currentPosition.next !=null){
        currentPosition.next.prev = currentPosition.prev;
      }
      currentPosition = currentPosition.prev;
    } else {
      currentPosition.next = currentPosition.next.next;
      if (currentPosition.next!=null){
        currentPosition.next.prev = currentPosition;
      }
    }
    this.list.size--;
    return;
  }

  public void set(E element){
    //System.out.println("before set "+forward+" "+currentPosition.toStringZ());
    if (forward){
      currentPosition.value = element;
    } else {
      currentPosition.next.value = element;
    }
    //System.out.println("after set "+currentPosition.toStringZ());
    return;
  }

  public Object[] toArray(){
    Object[] array = new Object[this.list.size()];
    Node n = this.list.start;
    int pos=0;
    while (n.next!=null){
      array[pos++]=n.next.value;
      n = n.next;
    }
    return array;
  }

}
