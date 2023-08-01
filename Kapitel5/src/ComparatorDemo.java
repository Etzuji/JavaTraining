import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 Name 2 Alter");
        int input = scan.nextInt();

        Comparator<Person> comp;
        if (input == 1) {
            comp = new PersonNameComparator();
        } else {
            comp = new SpecialPersonComparator();
        }

        Set<Person> persons = new TreeSet<Person>(comp);

        persons.add(new Person("Karl", 20));
        persons.add(new Person("Willi", 40));
        persons.add(new Person("Heinz", 30));
        persons.add(new Person("Patrick", 35));
        persons.add(new Person("Laura", 26));
        persons.add(new Person("Marcel", 44));
        persons.add(new Person("Alfred", 65));

        for (Person person : persons)
            System.out.println(person);
        scan.close();
    }
}

class SpecialPersonComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

class PersonNameComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return Person.compareTo(p1, p2);
    }
}