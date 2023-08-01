public class ArrayDemo3 {

    public static void main(String[] args) {

        int[] z;
        float durchschnitt = 0f;

        z = new int[10];


        for (int i = 0; i < z.length; i++) {
            System.out.print("Bitte geben Sie ");
            System.out.print("die " + (i + 1) + ". Zahl ein: ");
            z[i] = leseInteger();

        }

        for (int i = 0; i < z.length; i++) {
            durchschnitt += z[i];

        }

        durchschnitt /= z.length;
        System.out.print("Der Durchschnittswert Ihrer ");
        System.out.println("Eingaben beträgt: " + durchschnitt);

    }

    public static int leseInteger() {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try {
            return Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            return 0;
        }
    }
}