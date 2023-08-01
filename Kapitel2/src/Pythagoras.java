import java.util.Scanner;

public class Pythagoras {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie die Seitenlänge a ein ");
        double eingabeUser1 = scan.nextDouble();
        System.out.println("Bitte geben sie die Seitenlänge b ein");
        double eingabeUser2 = scan.nextDouble();

        double a = eingabeUser1;
        double b = eingabeUser2;
        double c = Math.hypot(a, b);

        System.out.print("Die Hypotenuse des Dreiecks mit einer Seitenlänge von ");
        System.out.println(a + " und " + b + " beträgt " + c);

        scan.close();
    }
}