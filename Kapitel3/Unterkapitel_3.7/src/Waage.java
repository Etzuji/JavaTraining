public class Waage {

    public static void main(String[] args) {

        Waage waage = new Waage();

        Weighable car = new Car(1300);
        Weighable fabian = new Person(85);
        Weighable b1 = new Goldbar(1.5);
        Weighable rc = new RacingCar(850, 1500);

        waage.showWeight(car);
        waage.showWeight(fabian);
        waage.showWeight(b1);
        waage.showWeight(rc);
    }


    public void showWeight(Weighable i) {
        System.out.println("Das Gewicht beträgt: " + i.getWeight() + "kg.");
    }

}