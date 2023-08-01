public class Booleandemo2 {

    public static void main(String[] args) {

        boolean ichHabeUrlaub, esIstWochenende;
        boolean esRegnet, dasWetterIstSchoen;
        boolean ichHabeFrei, ichMacheEinPicknick;

        ichHabeUrlaub = true;
        esIstWochenende = false;
        esRegnet = false;

        dasWetterIstSchoen = !esRegnet;
        ichHabeFrei = ichHabeUrlaub | esIstWochenende;
        ichMacheEinPicknick = ichHabeFrei & dasWetterIstSchoen;

        System.out.println("Zeit für ein Picknick? " + ichMacheEinPicknick);

    }

}