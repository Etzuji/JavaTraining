public class Test {

    public static void main(String[] args) {

        Segelboot b1 = new Segelboot(30, 3);
        Holzhuette h1 = new Holzhuette(3, true);

        showInfos(b1);
        showInfos(h1);

    }

    public static void showInfos(Segelboot i) {
        System.out.println("Das seegelbot hat " + i.getHatSegel() + " Segel");
        System.out.println("und hat einen Tiefgang von " + i.liefereTiefgang() + "cm.");
    }

    public static void showInfos(Holzhuette i) {
        System.out.print("Die Holzhütte hat " + i.liefereAnzahlZimmer() + " Zimmer.");

    }
}