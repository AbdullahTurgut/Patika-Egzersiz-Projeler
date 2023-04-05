package Giris;

import java.util.Scanner;

public class EvenTotal {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan
        sayıları toplayıp ekrana basan programı yazıyoruz.

        */
        Scanner scanner = new Scanner(System.in);
        int number;
        int toplam = 0;
        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            number = scanner.nextInt();
            if(number % 4 == 0){
                toplam += number;
            }
        } while (number % 2 != 1);

        System.out.print("Sayıların toplamı: " + toplam);
    }
}
