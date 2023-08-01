public class Holzhuette implements Haus {

    private final int anzahlZimmer;
    private boolean mitGarten;

    public Holzhuette(int zimmer, boolean garten) {
        this.anzahlZimmer = zimmer;
        this.mitGarten = garten;
    }

    public void setmitGarten(boolean garten) {
        mitGarten = garten;
    }

    @Override
    public int liefereAnzahlZimmer() {
        return anzahlZimmer;
    }

    @Override
    public boolean mitGarten() {
        return mitGarten;
    }

}