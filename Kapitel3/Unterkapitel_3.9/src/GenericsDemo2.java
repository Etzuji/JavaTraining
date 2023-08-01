public class GenericsDemo2 {

    public static void main(String[] args) {

        Pair<Person> paar;

        Person p1 = new Person("Frau Müller", 30);
        Person p2 = new Person("Herr Müller", 38);

        paar = new Pair<Person>(p1, p2);

        System.out.println(paar.getOne().getName() + " und ");
        System.out.println(paar.getTheOther().getName() + " sind ein Paar!");

    }

}