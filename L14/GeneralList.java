public class GeneralList<T>{
  private T[] list;
  private int size=0;

  public GeneralList(){
    list = (T[]) (new Object[1]);
  }

  public void add(T v){
    if (size>=list.length){
      expandList();
    }
    list[size]=v;
    size = size+1;
  }

  private void expandList(){
    T[] oldList = list;
    list = (T[]) (new Object[size*2]);
    System.out.println("Growing the list to size "+2*size);
    for(int i=0; i<size; i++){
      list[i] = oldList[i];
    }
  }

  public T get(int i){
    return list[i];
  }

  public void set(int i, T v){
    list[i]=v;
  }

  public int size(){
    return size;
  }
}
