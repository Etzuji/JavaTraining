public class MotorradDemo {


    public static void main(String[] args) {

        Motorrad[] motorraeder = new Motorrad[10];

        for (int i = 0; i < 10; i++) {
            motorraeder[i] = new Motorrad(0);
        }
        System.out.print("Anzahl Instanzen der Klasse ");
        System.out.println("Motorrad: " + motorraeder[0].anzahlMotorraeder);
    }

}