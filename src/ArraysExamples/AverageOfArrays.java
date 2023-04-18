package ArraysExamples;

public class AverageOfArrays {
    public static void main(String[] args) {
        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        //Harmonik Seri Formülü :
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0.0;
        double harmonicAverage = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += (1 / numbers[i]);
        }
        System.out.println("Dizinin Harmonic Seri Toplamı : " + harmonicSum);
        harmonicAverage = numbers.length / harmonicSum;
        System.out.println("Harmonic Ortalama : " + harmonicAverage);


    }
}
