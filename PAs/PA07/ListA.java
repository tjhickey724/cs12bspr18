import java.util.ListIterator;

public interface ListA<E>{

  public void add(int index, E element);
  public void clear();
  public boolean contains(E element);
  public E get(int index);
  public int indexOf(Object o);
  public boolean isEmpty();
  public ListIterator<E> iterator();
  public E remove(int index);
  public E set(int index, E element);
  public int size();
  public Object[] toArray();

}
