package figures;

public class Circle extends Figures {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Kreis mit Radius " + radius;
    }
}