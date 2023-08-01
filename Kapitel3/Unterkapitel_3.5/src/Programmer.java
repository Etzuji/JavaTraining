public class Programmer extends Person {

    private String programmingLanguage;

    public void setLanguage(String language) {
        programmingLanguage = language;
    }

    public String getLanguage() {
        return programmingLanguage;
    }

    public void introduceYourself() {
        super.introduceYourself();
        System.out.print("Ich bin Programmierer für ");
        System.out.println("die Sprache " + getLanguage() + "!");
    }
}