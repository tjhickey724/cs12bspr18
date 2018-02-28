public class Person implements Comparable<Person> {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name=name;
    this.age = age;
  }

  public int compareTo (Person p) {
    if (this.age == p.age ) {
      return this.name.compareTo(p.name);
    } else {
      return this.age - p.age;
    }
  }
  public int compareToOld (Person p) {
    if (this.name.equals(p.name) ) {
      return this.age - p.age;
    } else {
      return this.name.compareTo(p.name);
    }
  }
