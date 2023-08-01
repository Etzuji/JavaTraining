import java.util.Scanner;

public class Aufgabe {

    public static void main(String[] args) {

        double u = 0;
        System.out.println("Bitte geben Sie einen Radius ein");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();

        u = Math.PI * r * 2;

        System.out.println("Der umfang vom " + r + " beträgt " + u);
        scan.close();
    }
}