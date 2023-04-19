package ArraysExamples;

public class PrintBwithStars {
    public static void main(String[] args) {
        // Çok boyutlu diziler kullanılarak
        // "yıldızlar" ile ekrana "B" harfi yazan program
        String[][] letterB = new String[7][4];

        // * ile B harfi için nested for
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (i == 0 && j == 3)
                    letterB[i][j] = "   ";
                else if( i == 3 && j == 3)
                    letterB[i][j] = "   ";
                else if( i == 6 && j == 3)
                    letterB[i][j] = "   ";
                else if (i == 0 || i == 3 || i == 6)
                    letterB[i][j] = " * ";
                else if (j == 0 || j == 3) {
                    letterB[i][j] = " * ";
                } else
                    letterB[i][j] = "   ";
            }
        }

        // diziyi bastırmak için foreach
        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
