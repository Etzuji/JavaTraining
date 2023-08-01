public class StringDemo {

    public static void main(String[] args) {

        String a = "Strings sind Objekte";

        String big = a.toUpperCase();
        String teil = a.substring(13, 19);
        String neu = teil.concat("orientierung");
        boolean test = neu.startsWith("Objekt");

        System.out.println(big);
        System.out.println(neu);
        System.out.println(test);


    }

}