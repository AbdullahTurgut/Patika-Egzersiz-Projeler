package Giris;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        /*
        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner scanner = new Scanner(System.in);
        int n, r, comb;
        System.out.println("Lütfen kombinasyonu alınacak sayıları giriniz:");
        n = scanner.nextInt();
        r = scanner.nextInt();
        comb = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Kombinasyon: " + comb);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
