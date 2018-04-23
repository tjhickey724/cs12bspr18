import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;


public class WordCounter2{
  TreeMap<String,Integer>counter;

  public static void main(String[] args){
    if (args.length != 2){
      System.out.println("usage: java WordCounter FILENAME COUNT");
    }else {
      WordCounter2 w = new WordCounter2(args[0]);
      int num = Integer.parseInt(args[1]);
      System.out.println("The word love appears "+w.counter.get("love")+" times");
      System.out.println("The word computer appears "+w.counter.get("computer")+" times");
      if (w.counter.get("computer")==null){
        w.counter.put("computer",1);
      }
      System.out.println("The word computer appears "+w.counter.get("computer")+" times");
      w.sortByCount(num);
    }
  }

  public WordCounter2(String filename){
    counter = new TreeMap<String,Integer>();
    Scanner scanner = getScanner(filename);
    countWords(scanner);
  }

  private Scanner getScanner(String filename){
    Scanner scanner=null;
    try {
      scanner = new Scanner(new File(filename));
    }
    catch(Exception e){
        System.out.println("Problem reading file "+filename+": "+e);
    }
    return scanner;
  }

  private void countWords(Scanner scanner){
    while (scanner.hasNext()){
      String word = scanner.next();
      Integer count = counter.get(word);
      if (count==null) {
        counter.put(word,1);
      } else {
        counter.put(word,count+1);
      }
    }
  }

  /**
   * print all of the words that appeared at least num times in the text
   */
  public void printWords(int num){
    Set<String> keys = counter.keySet();
    for(String k: keys){
      int count = counter.get(k);
      if (count > num)
        System.out.println(k+": "+count);
    }
  }

  public void sortByCount(int num){
    ArrayList<Counter> counts = new ArrayList<Counter>();

    Set<String> keys = counter.keySet();

    for(String word: keys){
      int count = counter.get(word);
      counts.add(new Counter(word,count));
    }

    // here is how we sort an ArrayList using a given Comparator ...
    Collections.sort(counts,new CountOrder());
    for(Counter c: counts){
      if (c.count >= num) {
        System.out.println(c.word+"="+c.count);
      }
    }
  }

  static class Counter{
    String word;
    int count;
    public Counter(String word,int count){
      this.word=word; this.count=count;
    }
  }
  

  static class WordOrder implements Comparator<Counter>{
    public int compare(Counter a, Counter b){
      return a.word.compareTo(b.word);
    }
    public boolean equals(Counter a, Counter b){
      return (a.word.equals(b.word)) && (a.count==b.count);
    }
  }

  static class CountOrder implements Comparator<Counter>{
    public int compare(Counter a, Counter b){
      return a.count - b.count;
    }
    public boolean equals(Counter a, Counter b){
      return (a.word.equals(b.word)) && (a.count==b.count);
    }
  }
}
