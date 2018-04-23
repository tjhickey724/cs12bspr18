import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2{

  public static void main(String[] args){
    // here is how we create a Map (either HashMap or TreeMap)
    Map<String,String> d,r;

    d = new TreeMap<String,String>();
    r = new TreeMap<String,String>();

    // here is how we put things into the map
    d.put("Tim","fds78");
    d.put("Jiarui","789fd");
    d.put("R","gfd89");
    d.put("Xiaodong","78f9ds");
    d.put("Jerry","8f8f8a");
    d.put("Maria","8f8sas");
    d.put("Donald","a");
    d.put("Tabitha","8f8s9000");
    d.put("Marsden","sssae");

    Set<String> keys = d.keySet();
    for(String key: keys){
      r.put(d.get(key),key);
    }

    getDataFromUser(d,r);

    // here is how we get values out of a Map
    String timGrade = d.get("Tim");
    String zGrade = d.get("Z");
    System.out.println("The id for Tim is "+ timGrade);
    System.out.println("The id for Z is "+ zGrade);
    if (zGrade==null){
      System.out.println("Z doesn't have a grade!");
    }

    printDictionary(d);
    printDictionary(r);
  }

  public static void getDataFromUser(Map<String,String>d, Map<String,String>r){
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i<3;i++){
      System.out.println("name:");
      String name = scanner.next();
      System.out.println("id:");
      String id = scanner.next();
      scanner.nextLine();
      System.out.println("you entered "+
          name+" "+id);
      d.put(name,id);
      r.put(id,name);
      // add name/id pair to d and to r ..
    }
  }

  public static void printDictionary(Map<String,String>d){
    System.out.println("\n\n gradebook:\n");
    Set<String> keys = d.keySet();
    for(String name: keys){
      System.out.println("The id for "+name+" is "+d.get(name));
      //System.out.println("The hashcode for "+name+" is "+name.hashCode());
    }
  }

}
