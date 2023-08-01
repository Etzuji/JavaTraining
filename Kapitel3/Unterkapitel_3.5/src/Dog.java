public class Dog extends Animal {

    private String race;

    public Dog() {
        super("Carnivora");
    }

    public Dog(String race) {
        super("Carnivora");
        setRace(race);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}