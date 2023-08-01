public class Vererbung2 {

    public static void main(String[] args) {


        Person p1 = new Person();
        p1.setName("Peter");

        Sportsman p2 = new Sportsman();
        p2.setName("Paul");
        p2.setSport("Fußball");

        Programmer p3 = new Programmer();
        p3.setName("Maria");
        p3.setLanguage("Java");

        introductionOf(p1);
        introductionOf(p2);
        introductionOf(p3);

    }

    public static void introductionOf(Person x) {
        System.out.println(x.getName() + " stellt sich vor: ");
        x.introduceYourself();
        System.out.println();
    }
}