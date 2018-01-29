/**
  This is a program to compare the performance of
	String and StringBuilder and StringBuffer
	for combining a large number of strings.
	This program creates appends the strings "1" " 2" " 3".... " N"
	to form a new string, and does this N times....
	StringBuffer and StringBuilder are much faster that String for N=10000
	on a MacBook Pro in 1/2018
*/

public class TestString{
	public static void main(String[] args){
		if (args.length !=2) {
			System.out.println("Usage: TestString method n"+
			"\n where method is 'String' or 'StringBuilder' or 'StringBuffer'\n");
			return;
		}
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
		String s = "";
		int n = Integer.parseInt(args[1]);
		int counter = 0;

		switch (args[0]) {
			case "String":
				for(int j=0; j<n; j++){
					s = countUp1(n);
					counter += s.length();
				};
				break;
			case "StringBuilder":
				for(int j=0; j<n; j++){
					s = countUp2(n);
					counter += s.length();
				};
				break;
			case "StringBuffer":
				for(int j=0; j<n; j++){
					s = countUp3(n);
					counter += s.length();
				};
				break;
			default:
				System.out.printf("Unknown method %s\n",args[0]);
		}
		System.out.println(counter);
	}

	public static String countUp1(int n){
		String s="";
		for(int i=1; i<=n; i++){
			s = ""+ i + " " + s;
		}
		return s;
	}

	public static String countUp2(int n){
		StringBuilder sb= new StringBuilder();
		for(int i=1; i<=n; i++){
			sb.append(" "+ i);
		}
		String s = sb.toString();
		return s;
	}

	public static String countUp3(int n){
		StringBuffer sb= new StringBuffer();
		for(int i=1; i<=n; i++){
			sb.append(" "+ i);
		}
		String s = sb.toString();
		return s;
	}

}
