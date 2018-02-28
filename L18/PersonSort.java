import java.util.Arrays;

public class PersonSort {
  public static Person[] people = new Person[5];

  public static void main(String[] args){
    people[0] = new Person("Tim",62);
    people[1] = new Person("Tim",23);
    people[2] = new Person("Tim",44);
    people[3] = new Person("Jiarui", 27);
    people[4] = new Person("Maria",44);

    System.out.println("Before sorting");
    for(int i = 0; i<people.length; i++){
      System.out.println(people[i]);
    }

    Arrays.sort(people);

    System.out.println("\n\n After sorting");
    for(int i = 0; i<people.length; i++){
      System.out.println(people[i]);
    }

  }
}
