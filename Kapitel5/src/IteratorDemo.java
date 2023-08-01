import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

    public static void main(String[] args) {

        Set<String> menge = new TreeSet<String>();
        menge.add("Kirsche");
        menge.add("Apfel");
        menge.add("Birne");

        Iterator<String> fruitIterator = menge.iterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
        }
    }
}