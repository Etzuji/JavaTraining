package figures;

public abstract class Figures {

    private int x, y;

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getAreaPerimeterRatio() {
        return getArea() / getPerimeter();
    }
}
