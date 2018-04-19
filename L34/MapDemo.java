import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class MapDemo{
  public static void main(String[] args){
    // here is how we create a Map (either HashMap or TreeMap)
    Map<String,String> d;
    d = new HashMap<String,String>();

    // here is how we put things into the map
    d.put("Tim","B+");
    d.put("Jiarui","A");
    d.put("R","A+");
    d.put("Xiaodong","A+");
    d.put("Jerry","A");
    d.put("Maria","A");
    d.put("Donald","B");
    d.put("Tabitha","B+");
    d.put("Marsden","C+");

    // here is how we get values out of a Map
    String timGrade = d.get("Tim");
    String zGrade = d.get("Z");
    System.out.println("The grade for Tim is "+ timGrade);
    System.out.println("The grade for Z is "+ zGrade);
    if (zGrade==null){
      System.out.println("Z doesn't have a grade!");
    }

    printGradeBook(d);
  }

  public static void printGradeBook(Map<String,String>d){
    System.out.println("\n\n gradebook:\n");
    Set<String> keys = d.keySet();
    for(String name: keys){
      System.out.println("The grade for "+name+" is "+d.get(name));
    }
  }

}
