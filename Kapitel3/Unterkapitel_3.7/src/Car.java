public class Car implements Weighable {

    private final double weight;

    public Car(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}