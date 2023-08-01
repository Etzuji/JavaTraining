import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Peter", 31));
        persons.add(new Person("Paul", 35));
        persons.add(new Person("Maria", 30));

        for (int i = 0; i < persons.size(); i++) {
            Person somebody = persons.get(i);
            System.out.println("Name: " + somebody.getName());
            System.out.println("Alter: " + somebody.getAge());
            System.out.println();
        }
    }
}