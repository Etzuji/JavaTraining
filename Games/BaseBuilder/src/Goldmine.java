public class Goldmine {
    private final int level;
    private int goldGespeichert = 0;

    public Goldmine(int level) {
        this.level = level;
    }

    public void produziertGold() {
        goldGespeichert += 400 * level;
    }

    public int gebeGold() {
        return goldGespeichert;
    }

    public void leereMine() {
        goldGespeichert = 0;
    }

}