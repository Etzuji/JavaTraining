import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int gems = 0;
        int gold = 1000;
        int holz = 1000;
        Scanner scan = new Scanner(System.in);
        Holzhuette[] holzhuetten = new Holzhuette[100];
        Goldmine[] goldminen = new Goldmine[100];
        int holzhuettenIndex = 0;
        int goldminenIndex = 0;

        while (true) {
            System.out.println("Gold: " + gold + " | Holz: " + holz + " | Gems: " + gems);
            if (gems >= 2000) {
                System.out.println("Du hast das Spiel gewonnen");
                break;
            } else {
                System.out.println("Möchtest du eine Holzhütte(1), eine Goldmine(2)oder Edelsteine kaufen(3)?");
                System.out.println("Abfrage Gebäude(4) die nächste Runde(5) starten oder das SpielBeenden(6)?");
                int input = scan.nextInt();
                if (input == 1) {
                    if (holzhuettenIndex < 100) {
                        System.out.println("Eine Holzhütte kostet dich pro Level 500 Holz und 2000 Gold");
                        System.out.println("Bitte geben sie das Gewünschte Level ein");
                        int level = scan.nextInt();
                        if (level > 0 && level < 10 && level * 200 <= gold && level * 500 <= holz) {
                            holzhuetten[holzhuettenIndex] = new Holzhuette(level);
                            holzhuettenIndex++;
                            holz -= 500 * level;
                            gold -= 200 * level;
                            System.out.println("Du hast " + level + " Holzhütten gekauft");
                        } else {
                            System.out.println("Leider nicht genug Material");
                        }
                    } else {
                        System.out.println("Maximale Anzahl an Hütten erreicht");
                    }
                }
                if (input == 2) {
                    if (goldminenIndex < 100) {
                        System.out.println("Eine Goldmine kostet dich pro Level 600 Holz und 800 Gold");
                        System.out.println("Bitte geben sie das Gewünschte Level ein");
                        int level = scan.nextInt();
                        if (level > 0 && level < 10 && level * 800 <= gold && level * 600 <= holz) {
                            goldminen[goldminenIndex] = new Goldmine(level);
                            goldminenIndex++;
                            holz -= 600 * level;
                            gold -= 800 * level;
                            System.out.println("Du hast " + level + " Goldminen gekauft");
                        } else {
                            System.out.println("Leider nicht genug Material");
                        }
                    } else {
                        System.out.println("Maximale Anzahl an Minen erreicht");
                    }
                }
                if (input == 3) {
                    System.out.println("Ein Edelstein kostet 100 Gold und 10 Holz");
                    System.out.println("Wie viele Edelsteine willst du Kaufen?");
                    int anzahl = scan.nextInt();
                    if (anzahl * 100 <= gold && anzahl * 10 <= holz) {
                        gems += anzahl;
                        gold -= anzahl * 100;
                        holz -= anzahl * 10;
                    } else {
                        System.out.println("Leider nicht genug Material");
                    }
                }
                if (input == 4) {
                    System.out.println("du hast " + holzhuettenIndex + " Holzhütten und " + goldminenIndex + " Goldminen.");
                    System.out.println("Diese Produzieren " + erhalteHolzVonHuetten(holzhuetten, holzhuettenIndex) + " Holz und " + erhalteGoldVonMinen(goldminen, goldminenIndex) + " Gold.");
                }
                if (input == 6) {
                    break;
                }
                gold += erhalteGoldVonMinen(goldminen, goldminenIndex);
                holz += erhalteHolzVonHuetten(holzhuetten, holzhuettenIndex);

            }
        }
        scan.close();
    }

    public static int erhalteGoldVonMinen(Goldmine[] goldminen, int goldminenIndex) {
        int goldSumme = 0;

        for (int i = 0; i < goldminenIndex; i++) {
            Goldmine goldmine = goldminen[i];
            goldmine.produziertGold();
            goldSumme += goldmine.gebeGold();
            goldmine.leereMine();
        }
        return goldSumme;
    }

    public static int erhalteHolzVonHuetten(Holzhuette[] holzhuetten, int holzhuettenIndex) {
        int holzSumme = 0;

        for (int i = 0; i < holzhuettenIndex; i++) {
            Holzhuette holzhuette = holzhuetten[i];
            holzhuette.produziertHolz();
            holzSumme += holzhuette.gebeHolz();
            holzhuette.leereHuette();
        }
        return holzSumme;
    }
}