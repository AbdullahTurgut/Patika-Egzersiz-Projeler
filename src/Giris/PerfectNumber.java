package Giris;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /*
        Mükemmel Sayı Nedir ?
            Bir sayının kendisi hariç pozitif
            tam sayı çarpanları (kalansız bölen sayıların)
            toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        Scanner scanner = new Scanner(System.in);
        int n1, toplam = 0;
        System.out.print("Bir sayı giriniz: ");
        n1 = scanner.nextInt();

        if (n1 == 1)
            System.out.println(n1 + " mükemmel sayı değildir.");

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n1)
            System.out.println(n1 + " mükemmel sayıdır.");
        else
            System.out.println("değildir.");
    }
}
