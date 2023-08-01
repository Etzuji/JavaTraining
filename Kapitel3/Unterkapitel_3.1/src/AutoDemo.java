public class AutoDemo {

    public static void main(String[] args) {

        Auto meins, deins;
        meins = new Auto();
        deins = new Auto();

        meins.marke = "BMW";
        meins.farbe = "rot";
        meins.tempo = 0;
        meins.ps = 120;
        meins.beschleunigen();

        deins.marke = "Toyota";
        deins.farbe = "blau";
        deins.tempo = 0;
        deins.ps = 140;


        System.out.print("Meine Marke: " + meins.marke);
        System.out.print(", Meine Geschw.: " + meins.tempo);
        System.out.print(", Meine Leistung ist " + meins.ps + " PS");
        System.out.println(", Meine Farbe ist " + meins.farbe);

        System.out.print("Deine Marke: " + deins.marke);
        System.out.print(", Deine Geschw.: " + deins.tempo);
        System.out.print(", Deine Leistung ist " + deins.ps + " PS");
        System.out.println(", Deine Farbe ist " + deins.farbe);

        String s1 = "hallo";
        String s2 = "hallo";
        String s3 = "hallo";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }

}