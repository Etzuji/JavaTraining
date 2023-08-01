public class Bitmap {

    public static void main(String[] args) {

        int[][] bitmap = {
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}
        };

        for (int zeile = 0; zeile < bitmap.length; zeile++) {
            for (int spalte = 0; spalte < bitmap[zeile].length; spalte++) {

                int farbe = bitmap[zeile][spalte];

                if (farbe == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}