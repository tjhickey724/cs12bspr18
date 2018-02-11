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
}
