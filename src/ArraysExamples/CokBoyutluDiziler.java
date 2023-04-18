package ArraysExamples;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int[][] uzaklik = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        int[][] matris = new int[3][4];
//        System.out.println(matris.length); // matrisin uzunluğu 'satır' sayısı olarak verdi
//        System.out.println(matris[0].length); // burda 1. satırın uzunluğunu 'sütun' sayısını verdi

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j] = (i * 5) + (j * 2);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
    }
}
}
