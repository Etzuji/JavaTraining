public class Auto {

    public String marke;
    public String farbe;
    public int tempo;
    public int ps;


    public void beschleunigen() {
        tempo += 10;
        if (tempo > 180) tempo = 180;

    }

    public void bremse() {
        tempo -= 10;
        if (tempo < 0) tempo = 0;

    }
}