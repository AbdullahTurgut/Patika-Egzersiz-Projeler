package Giris;

import java.util.Scanner;

public class GivenNumberExponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = scanner.nextInt();
        int temp = 1;
        // 3^4 -> 3*3*3*3

        for (int i = 1; i <= k; i++) {
            temp *= n;
        }
        System.out.printf("%d^%d -> %d",n,k,temp);
    }
}
