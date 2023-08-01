import java.util.Scanner;

public class Altersumrechnung {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Wie ist dein Name ? ");
        String name = sc.next();
        System.out.println("Wie ist dein alter ? ");
        int alterInJahren = sc.nextInt();

        int alterInTagen, alterInStunden, alterInMinuten;
        long alterInSekunden;

        alterInTagen = alterInJahren * 365;
        alterInStunden = alterInTagen * 24;
        alterInMinuten = alterInStunden * 60;
        alterInSekunden = alterInMinuten * 60L;

        System.out.println("Hallo " + name + "!");
        System.out.print(alterInJahren + " Jahre entsprechen " + alterInTagen + " Tagen");
        System.out.print(" oder " + alterInStunden + " Stunden");
        System.out.print(" oder " + alterInMinuten + " Minuten");
        System.out.println(" oder " + alterInSekunden + " Sekunden.");
        sc.close();
    }
}