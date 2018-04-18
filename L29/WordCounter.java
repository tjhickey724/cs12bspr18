import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

/**
 * This class implements an algorithm to generate paragraphs in the style of
 * William Shakespeare. It does this by creating a HashMap which associates
 * to each word in Romeo and Juliet the ArrayList of all words that follow that one.
 * It then generates sentences by starting with a specified word and then
 * repeatedly picking a random word that follows that one, and iterating some
 * fixed number of times...


 THIS NEEDS A LOT OF WORK ....
 
 */

public class Shakespeare {
  HashMap<String,Integer>
     nextWords = new HashMap<String,Integer>();
  String[] allWords;
  Random random = new Random();

  public Shakespeare(String filename) {
    File play;
    String lastWord = "";
    String word;
    ArrayList<String> words;
    try{
      play = new File(filename);
      Scanner scanner = new Scanner(play);
      while (scanner.hasNext()){
        word = scanner.next();
        if (!lastWord.equals("")) {
          words = nextWords.get(lastWord);
          if (words==null) {
            words = new ArrayList<String>();
            nextWords.put(lastWord,words);
          }
          words.add(word);
        }
        lastWord = word;
      }
      allWords = new String[nextWords.size()];
      allWords = (String[]) nextWords.keySet().toArray(allWords);
    } catch(Exception e) {
      System.out.println("Exception:  "+e);
    }
  }

  public static void main(String[] args){
    int counter=0;
    Shakespeare s = new Shakespeare("TomSawyer.txt");
    String word = s.pickRandom(s.allWords); //"love";
    int n = Integer.parseInt(args[0]);
    ArrayList<String> words;
    System.out.println(s.allWords);
    for(int i=0;i<n; i++){
      System.out.print(" "+word);
      counter++;
      if (counter >= 15){
        System.out.println();
        counter = 0;
      }
      if (word.endsWith(".")){
        System.out.println();
        counter=0;
      }
      words=s.nextWords.get(word);
      word = s.pickRandom(words);
    }
  }

  private String pickRandom(ArrayList<String> words){
    int i = this.random.nextInt(words.size());
    return words.get(i);
  }

  private String pickRandom(String[] words){
    int i = this.random.nextInt(words.length);
    return words[i];
  }
}
