public class IntList{
  private int[] list;
  private int size=0;

  public IntList(){
    list = new int[1];
  }

  public void add(int v){
    if (size>=list.length){
      expandList();
    }
    list[size]=v;
    size = size+1;
  }

  private void expandList(){
    int[] oldList = list;
    list = new int[size*2];
    System.out.println("Growing the list to size "+2*size);
    for(int i=0; i<size; i++){
      list[i] = oldList[i];
    }
  }

  public int get(int i){
    return list[i];
  }

  public void set(int i, int v){
    list[i]=v;
  }

  public int size(){
    return size;
  }
}
