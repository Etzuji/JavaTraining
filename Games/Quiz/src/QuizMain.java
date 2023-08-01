import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        // Fragen abrufen aus Datei.
        File fragenDatei = new File("Games/Quiz/src/fragen1.txt");
        Scanner fragScanner = null;

        try {
            fragScanner = new Scanner(fragenDatei);
        } catch (FileNotFoundException e) {
            System.out.println("File fragen1.txt not found");
            return;
        }

        // Fragen in eine ArrayList speichern
        ArrayList<String> fragenListe = new ArrayList<>();
        while (fragScanner.hasNext()) {
            fragenListe.add(fragScanner.nextLine());
        }
        fragScanner.close();

        // Antworten abrufen aus Datei.
        File antwortDatei = new File("Games/Quiz/src/antwort1.txt");
        Scanner antwortScanner = null;

        try {
            antwortScanner = new Scanner(antwortDatei);
        } catch (FileNotFoundException e) {
            System.out.println("File antwort1.txt not found");
            return;
        }

        // Antworten in eine ArrayList speichern
        ArrayList<String> antwortListe = new ArrayList<>();
        while (antwortScanner.hasNext()) {
            antwortListe.add(antwortScanner.nextLine());
        }
        antwortScanner.close();

        // Ausgabe der Fragen und Vergleich der Usereingabe und der Antwort.
        for (int i = 0; i < fragenListe.size(); i++) {
            String frage = fragenListe.get(i);
            String erwarteteAntwort = antwortListe.get(i);

            String eingabeUser = JOptionPane.showInputDialog(frage);
            if (eingabeUser.equals(erwarteteAntwort)) {
                JOptionPane.showMessageDialog(null, "Richtig");
            } else {
                JOptionPane.showMessageDialog(null, "Falsch");
            }
        }
    }
}





/*
import java.util.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Throwable;

public class QuizMain extends Fragen {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) throws IOException, Throwable {

// Fragen abrufen aus Datei.	
        File fragen = new File("fragen1.txt");
        Scanner frag = null;

        try {
            frag = new Scanner(fragen);
        } catch (FileNotFoundException e) {
            System.out.println("File fragen Not Found");
        }
        while (frag.hasNext()) {
            ArrayList<String> fra = new ArrayList<>();
            fra.add(frag.next());
        }

// Antworten abrufen aus Datei.		
        File antwort = new File("antwort1.txt");
        Scanner ant = null;

        try {
            ant = new Scanner(antwort);
        } catch (FileNotFoundException e) {
            System.out.println("File antwort Not Found");
        }
        while (ant.hasNext()) {
            ArrayList<String> antw = new ArrayList<>();
            antw.add(ant.next());
        }

//// Check ob Datei geladen wird.		
//		System.out.println(fragen.isFile());
//		System.out.println(antwort.isFile());

// Ausgbe der Fragen und vergleich der Usereingbe und der Antwort.
//		int count = 0;
        while (frag.hasNext()) {
            String eingabeUser = JOptionPane.showInputDialog(frag);
            if (eingabeUser.equals(ant)) {
                JOptionPane.showMessageDialog(null, "Richtig");
//				count++;
            } else {
                JOptionPane.showMessageDialog(null, "Falsch");
            }
        }
    }
}

 */