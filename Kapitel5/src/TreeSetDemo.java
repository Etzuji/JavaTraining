import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<String> menge = new TreeSet<String>();
        menge.add("Kirsche");
        menge.add("Apfel");
        menge.add("Birne");
        for (String element : menge)
            System.out.println(element);
    }
}