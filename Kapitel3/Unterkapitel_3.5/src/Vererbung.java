public class Vererbung {

    public static void main(String[] args) {

        Person p = new Person();
        Sportsman s = new Sportsman();
        Athlete a = new Athlete();
        Programmer pr = new Programmer();

        p.setName("Paul");
        s.setName("Maria");
        s.setSport("Tennis");
        a.setName("John");
        a.setSport("Bodenturnen");
        pr.setName("Martin");
        pr.setLanguage("Java");

        p.introduceYourself();
        s.introduceYourself();
        a.introduceYourself();
        pr.introduceYourself();
    }
}