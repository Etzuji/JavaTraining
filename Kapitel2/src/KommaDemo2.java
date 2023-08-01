import java.util.Scanner;

public class KommaDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Temperatur eintragen.");
        float temperaturCelsius = sc.nextInt();

        float temperaturFahrenheit;

        temperaturFahrenheit = temperaturCelsius * 1.8f + 32f;

        System.out.print(temperaturCelsius + " Grad Celsius");
        System.out.print(" entsprechen ");
        System.out.println(temperaturFahrenheit + " Grad Fahrenheit.");

        sc.close();
    }

}