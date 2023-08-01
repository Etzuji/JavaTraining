public class Auto {

    public String marke;
    public String farbe;
    public int tempo;
    public int ps;

    public Auto() {
        marke = "unbekannt";
        farbe = "unbekannt";
        tempo = 0;
        ps = 50;
    }

    public Auto(String m) {
        marke = m;
        tempo = 0;
        ps = 0;
    }

    public Auto(String n, int t, int p) {
        marke = n;
        tempo = t;
        ps = p;

    }

    public void beschleunigen() {
        tempo += 10;
        if (tempo > 180)
            tempo = 180;

    }

    public void bremse() {
        tempo -= 10;
        if (tempo < 0)
            tempo = 0;

    }
}