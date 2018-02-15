<<<<<<< HEAD
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
=======
public class GeneralList<T> {
	// we make an array, list, of objects and cast it to an array of type T
	private T[] list = (T[]) (new Object[1]);
	private int size = 0;

	public GeneralList(){

	}

	public void add(T x){
		if (size >= list.length){
			expandList();
		}
		list[size++] = x;
	}

	public T get(int p){
		return list[p];
	}

	public void set(int p, T v){
		list[p]=v;
	}

	public int size(){
		return size;
	}

	private void expandList(){
		T[] oldList = list;
		list = (T[]) (new Object[size*2]);
		System.out.println("Expanding to "+size*2+" the list currently contains:");
		for(int i=0; i<size; i++){
			list[i] = oldList[i];
			System.out.print(list[i]+" ");
		}
		System.out.println("\n");
	}
>>>>>>> 5a91e60c45741b6849c1a6ad2e87a86d50561a3e
}
