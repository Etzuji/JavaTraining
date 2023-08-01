public class GenericsDemo3 {

    public static void main(String[] args) {

        Person anna = new Person("Anna", 22);

        Pair2<Person, String>
                paar = new Pair2(anna, "Blumen");

        System.out.print(paar.getOne().getName() + " verkauft ");
        System.out.println(paar.getTheOther());
    }
}