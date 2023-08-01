public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rechteck mit den Seitenlängen " + width + " und " + height;
    }
}