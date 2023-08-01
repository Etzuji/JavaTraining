import java.util.Scanner;

public class W_4_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Anfangszahl ein!");
        int s1 = sc.nextInt();
        int e1 = s1;
        System.out.println("Geben Sie die Endzahl ein!");
        int end = sc.nextInt();
        sc.close();
        for (int s2 = s1; s2 <= end; s2++) {
            s1 = s1 + s2;
        }
        s1 = s1 - e1;

        System.out.println("Das ergebniss ist " + s1);
    }
}