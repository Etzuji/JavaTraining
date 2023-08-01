public class IfDemo2 {

    public static void main(String[] args) {

        int alter = 15;
        alter = alter++;

        if (alter >= 18) {
            System.out.println("Sie sind volljährig");
        } else {
            System.out.print("In " + (18 - alter) + " Jahren ");
            System.out.println("sind Sie volljährig");
        }
        System.out.println("Auf Wiedersehen");

    }

}