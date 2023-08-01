import figures.Circle;
import figures.Figures;
import figures.Rectangle;

public class Test {

    public static void main(String[] args) {

        Figures f1 = new Circle(3);
        Figures f2 = new Circle(7);
        Figures r1 = new Rectangle(5, 7);

        showInfosFor(f1);
        showInfosFor(f2);
        showInfosFor(r1);
    }


    public static void showInfosFor(Figures x) {
        System.out.println("INFOS FÜR " + x);
        System.out.println("Fläche: " + x.getArea());
        System.out.println("Umfang: " + x.getPerimeter());
        System.out.print("Verhältnis vom Fläche und Umfang ");
        System.out.println(x.getAreaPerimeterRatio());
        System.out.println();
    }
}