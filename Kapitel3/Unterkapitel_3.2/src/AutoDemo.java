public class AutoDemo {

    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto("BMW");
        Auto a3 = new Auto("VW", 120, 80);

        System.out.println("Marke des neuen Autos: " + a1.marke);
        System.out.println("Marke des neuen Autos: " + a2.marke);
        System.out.println("Marke des neuen Autos: " + a3.marke + " " + a3.tempo + " " + a3.ps);
    }
}