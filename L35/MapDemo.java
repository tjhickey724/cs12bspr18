import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MapDemo{
  public static void main(String[] args){
    // here is how we create a Map (either HashMap or TreeMap)
    Map<String,String> d;
    //d = new HashMap<String,String>();
    d = readMapFromFile("map.txt");
    printGradeBook(d);

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
    System.out.println("*****\nThe grade for Tim is "+ timGrade);
    System.out.println("The grade for Z is "+ zGrade);
    if (zGrade==null){
      System.out.println("Z doesn't have a grade!");
      d.put("Z","Y");
    }

    printGradeBook(d);
    writeMapToFile(d,"map.txt");
  }

  public static void printGradeBook(Map<String,String>d){
    System.out.println("\n\n gradebook:\n");
    Set<String> keys = d.keySet();
    for(String name: keys){
      System.out.println("The grade for "+name+" is "+d.get(name));
    }
  }

  public static void writeMapToFile(Map<String,String>d,String filename){
    try {
      PrintWriter writer = new PrintWriter(filename, "UTF-8");
      Set<String> keys = d.keySet();
      for(String name: keys){
        writer.println(name+"|"+d.get(name));
      }
      writer.close();
    } catch (Exception e){
      System.out.println("Problem writing to file: "+e);
    }
  }

  public static Map<String,String> readMapFromFile(String filename){
      Map<String,String> d = new HashMap<String,String>();
      try{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
          String line = scanner.nextLine();
          int delimiter = line.indexOf("|");
          String key = line.substring(0,delimiter);
          String value = line.substring(delimiter+1);
          d.put(key,value);
        }
        scanner.close();
      } catch (Exception e){
        System.out.println("Problem reading map from file "+e);
      }
      return d;
  }

}
