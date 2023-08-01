public class Hausboot implements Haus, Boot {

    private int anzahlZimmer;
    private final double tiefgangInCm;
    private boolean mitMotor;

    public Hausboot(int zimmer, int tiefgang, boolean mitMotor) {
        tiefgangInCm = tiefgang;
    }

    @Override
    public double liefereTiefgang() {
        return tiefgangInCm;
    }

    @Override
    public int liefereAnzahlZimmer() {
        return anzahlZimmer;
    }

    @Override
    public boolean mitGarten() {
        return false;
    }

    public boolean hatMotor() {
        return mitMotor;
    }

}