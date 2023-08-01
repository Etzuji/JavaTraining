public class Holzhuette {
    private final int level;
    private int holzGespeichert = 0;

    public Holzhuette(int level) {
        this.level = level;
    }

    public void produziertHolz() {
        holzGespeichert += 100 * level;
    }

    public int gebeHolz() {
        return holzGespeichert;
    }

    public void leereHuette() {
        holzGespeichert = 0;
    }
}