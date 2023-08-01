public class AutoDemo {

    public static void main(String[] args) {
        Auto batmobil = new Auto();
        batmobil.setSpeed(320);
        batmobil.setMarke("BMW");

        System.out.print("Batmobils Geschwindigkeit: ");
        System.out.println(batmobil.getSpeed() + "km/h");
        System.out.print("Batmobils Marke: ");
        System.out.println(batmobil.getMarkeString());

    }
}