public class ObjectList{
  private Object[] list;
  private int size=0;

  public ObjectList(){
    list = new Object[1];
  }

  public void add(Object v){
    if (size>=list.length){
      expandList();
    }
    list[size]=v;
    size = size+1;
  }

  private void expandList(){
    Object[] oldList = list;
    list = new Object[size*2];
    System.out.println("Growing the list to size "+2*size);
    for(int i=0; i<size; i++){
      list[i] = oldList[i];
    }
  }

  public Object get(int i){
    return list[i];
  }

  public void set(int i, Object v){
    list[i]=v;
  }

  public int size(){
    return size;
  }
}
