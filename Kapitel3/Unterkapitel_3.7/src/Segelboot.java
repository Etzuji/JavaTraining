public class Segelboot implements Boot {

    private final int tiefgangInCm;
    private int hatSegel;

    public Segelboot(int tiefgang, int segel) {
        tiefgangInCm = tiefgang;
        hatSegel = segel;
    }

    public void setHatSegel(int segel) {
        if (segel > 0) {
            this.hatSegel = segel;
        } else {
            System.out.println("Ungültiger Wert für ein Segel");
        }
    }

    public int getHatSegel() {
        return hatSegel;
    }

    @Override
    public double liefereTiefgang() {
        return tiefgangInCm;
    }

}