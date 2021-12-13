package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPeople {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Dennis", 44, "Nairobi"));
        people.add(new Person("Mary", 14, "Kisumu"));
        people.add(new Person("John", 13, "kwale"));
        people.add(new Person("Ruth", 24, "Mandera"));
        people.add(new Person("Karen", 32, "Kakuma"));
        people.add(new Person("Peter", 29, "Isiolo"));
        people.add(new Person("Irene", 7, "nyeri"));
        people.add(new Person("Mohamud", 21, "voi"));

        Collections.sort(people);

        for(Person i: people) System.out.println(i);
    }

}
class Person implements Comparable<Person>{
    String name;
    int age;
    String location;

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        if(this.getAge() < o.getAge()) return -1;
        else if(this.getAge() > o.getAge()) return  1;
        return 0;
    }
}