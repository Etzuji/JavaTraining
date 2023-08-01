import java.util.Scanner;

public class W_4_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie die erste Zahl ein!");
        int i1 = sc.nextInt();
        System.out.println("Bitte geben sie die zweite Zahl ein!");
        int i2 = sc.nextInt();
        System.out.println("Bitte geben sie die dritte Zahl ein!");
        int i3 = sc.nextInt();
        sc.close();

        if (i1 > i2 && i1 > i3) {
            System.out.println(i1 + " ist die größte Zahl!");
        }
        if (i2 > i1 && i2 > i3) {
            System.out.println(i2 + " ist die größte Zahl!");
        }
        if (i3 > i1 && i3 > i2) {
            System.out.println(i3 + " ist die größte Zahl!");
        } else {
            System.out.println("Falsche eingabe!");
        }
    }
}