public class RacingCar extends Car {

    private final int horsePower;

    public RacingCar(double gewicht, int leistung) {
        super(gewicht);            //Warum kann man hier mit gewicht arbeiten und nicht mit weight????
        horsePower = leistung;
    }

    public int getHP() {
        return horsePower;
    }
}