package Giris;

import java.util.Scanner;

public class TotalNumberOfDigits {
    public static void main(String[] args) {

//      Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner scanner = new Scanner(System.in);

        int number, total = 0;
        int digit;
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();

        while (number > 0) {
            digit = number % 10;
            number /= 10;
            total += digit;
        }

        System.out.println("Total -> " + total);
    }
}
