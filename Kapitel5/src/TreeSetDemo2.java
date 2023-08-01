import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {

        Set<Person> personen = new TreeSet<Person>();

        personen.add(new Person("Karl", 20));
        personen.add(new Person("Willi", 40));
        personen.add(new Person("Heinz", 30));

        for (Person x : personen)
            System.out.println(x);

    }
}