import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2{

  public static void main(String[] args){
    // here is how we create a Map (either HashMap or TreeMap)
    Map<String,String> d,r;

    // read the maps from files

    getDataFromUser(d,r);

    printDictionary(d);
    printDictionary(r);

  // write the maps to files ...
  
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
        Map<String,String> d = new TreeMap<String,String>();
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
        } catch (FileNotFoundException e){
          System.out.println("Problem reading map from file "+e);
        }
        return d;
    }


}
