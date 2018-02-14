public class TestStringList{

	public static void main(String[] args){
		GeneralList<String> list = new GeneralList<String>();
		//GeneralList<Integer> list = new GeneralList<Integer>();
		for(int i=0; i<20; i++) {
			list.add("string:"+i);
		}

		System.out.println("list[10]="+list.get(10));
    String s0 = list.get(0);
    System.out.println("pos 0 contains "+s0);

		System.out.println("setting list[10] to 99");
		list.set(10,"99");
		System.out.println("list[10]="+list.get(10));
		System.out.println("list size is "+list.size());
		System.out.println("list is");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();

	}
}
