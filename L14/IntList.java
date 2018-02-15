<<<<<<< HEAD
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
=======
public class IntList {
	private int[] list = new int[1];
	private int size = 0;

	public IntList(){
	}

	public void add(int x){
		if (size >= list.length){
			expandList();
		}
		list[size++] = x;
	}

	public int get(int p){
		return list[p];
	}

	public void set(int p, int v){
		list[p]=v;
	}

	public int size(){
		return size;
	}

	private void expandList(){
		int[] oldList = list;
		list = new int[size*2];
		System.out.println("Expanding to "+size*2+" the list currently contains:");
		for(int i=0; i<size; i++){
			list[i] = oldList[i];
			System.out.print(list[i]+" ");
		}
		System.out.println("\n");
	}
>>>>>>> 5a91e60c45741b6849c1a6ad2e87a86d50561a3e
}
