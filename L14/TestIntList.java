public class TestIntList{

	public static void main(String[] args){
<<<<<<< HEAD
		IntList list = new IntList();
		//GeneralList<Integer> list = new GeneralList<Integer>();
=======
		//IntList list = new IntList();
		GeneralList<Integer> list = new GeneralList<Integer>();
>>>>>>> 5a91e60c45741b6849c1a6ad2e87a86d50561a3e
		for(int i=0; i<20; i++) {
			list.add(100+i);
		}
		System.out.println("list[10]="+list.get(10));
		System.out.println("setting list[10] to 99");
		list.set(10,99);
		System.out.println("list[10]="+list.get(10));
		System.out.println("list size is "+list.size());
		System.out.println("list is");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();

	}
}
