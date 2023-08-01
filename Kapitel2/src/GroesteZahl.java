public class GroesteZahl {

    public static void main(String[] args) {

        int[] zahlen = {33, 55, -100, 50, 500, -13};

        int groessteZahl = zahlen[0];

        for (
                int aktuelleZahl : zahlen) {
            if (aktuelleZahl > groessteZahl) {
                groessteZahl = aktuelleZahl;
            }
        }
        System.out.println("Größte Zahl: " + groessteZahl);
    }
}