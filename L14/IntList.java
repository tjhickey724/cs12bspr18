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
}
