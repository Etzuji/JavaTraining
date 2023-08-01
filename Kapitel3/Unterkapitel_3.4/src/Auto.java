public class Auto {

    private String marke;
    private int tempo;
    private int ps;

    public Auto() {
        marke = "unbekannt";
        tempo = 0;
        ps = 0;

    }

    public void setSpeed(int s) {
        if (s >= 0 && s <= 180) {
            tempo = s;
        } else {
            System.out.print("Auto.setSpeed: Fehler! Geschwindigkeit ");
            System.out.print("muss zwischen 0 und 180 liegen!");
            System.out.println("Alte Geschwindigkeit wird beibehalten!");
        }
    }

    public int getSpeed() {
        return tempo;
    }

    public void setPower(int p) {
        if (p >= 0 && p <= 500) {
            ps = p;
        } else {
            System.out.print("Auto.setPower: Fehler! Leistung ");
            System.out.print("muss zwischen 0 und 500 liegen!");
            System.out.println("Alte Leistung wird beibehalten!");
        }
    }

    public int getPower() {
        return ps;
    }

    public void setMarke(String m) {
        if (m.equals("BMW") || m.equals("VW") || m.equals("Mercedes") || m.equals("Toyota")) {
            marke = m;
        } else {
            System.out.print("Auto.setMarke: Fehler! Marke ");
            System.out.print("muss BMW, Mercedes, Toyota oder VW sein!");
            System.out.println("Alte Marke wird beibehalten!");
        }
    }

    public String getMarkeString() {
        return marke;
    }
}