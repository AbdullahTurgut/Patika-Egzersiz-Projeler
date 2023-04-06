package Giris;

import java.util.Scanner;

public class TotalOfHarmonic {
    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner scanner = new Scanner(System.in);

        int n;
        double totalHarmonic = 0;
        System.out.print("Harmonik değeri bulunacak sayıyı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            totalHarmonic += ((double) 1 / i);
        }
        System.out.println("Harmonik sonuç -> " + totalHarmonic);
    }
}
