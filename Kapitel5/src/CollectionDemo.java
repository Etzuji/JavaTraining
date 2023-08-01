import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> menge = new ArrayList<String>();

        menge.add("Grün");
        menge.add("Blau");
        menge.add("Rot");
        menge.add("Rot");

        System.out.println("Elemente der Menge: ");

        for (String element : menge) {
            System.out.println(element);
        }
    }
}