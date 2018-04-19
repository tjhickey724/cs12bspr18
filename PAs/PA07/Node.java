public class Node<E> {
  E value;
  Node<E> next, prev;

  public String toStringZ(){
    return "Node("+prev+","+this+":"+value+","+next+")";
  }
}
