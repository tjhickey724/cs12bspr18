public class Node<E> {
  E value;
  Node<E> next, prev;

  public String toString(){
    return "Node("+value+")";
  }
}
