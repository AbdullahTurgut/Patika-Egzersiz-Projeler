package Functions;

import java.util.Scanner;

public class RecursivePrimeNumber {
    static boolean isPrime(int n, int i)
    {
        // öncelikli yapılacak
        if (n <= 2)  // sayı 2 den küçük mü sorgusu
            return (n == 2) ? true : false; // 2 ye eşitse doğru değilse yanlış
        if (n % i == 0) // sayının sayaca bölümlerinde kalan 0 mı
            return false; // öyleyse yanlış
        if (i * i > n) // sayacın karesi sayıdan büyük mü sorgusu
            return true;


        // Bölme için kontrol
        return isPrime(n, i + 1); // sayıyı ve sayacın bir fazlasını tekrar fonksiyona sokuyoruz
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number= scanner.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " bir asal sayıdır.");
        else
            System.out.println(number + " bir asal sayı değildir.");
    }
}
