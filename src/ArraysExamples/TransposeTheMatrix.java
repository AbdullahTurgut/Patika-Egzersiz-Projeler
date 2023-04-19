package ArraysExamples;

public class TransposeTheMatrix {
    public static void main(String[] args) {
        // NxK lık bir matris -> KxN lik Transpoze

        // matris
        int[][] original = {{1, 2, 3}, {4, 5, 6}};

        // transpozu tutacak matris
        int[][] transpose = new int[3][2];  // 3 satır 2 sütuna döner

        // matrisi transpoz matrise çevir
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
