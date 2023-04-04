package Giris;

import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        // artık yıl bulmak için
        // 4'ün katları ve 400 'e bölümünden kalan sıfır

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Lütfen yıl giriniz: ");
        year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.println(year + " artık yıldır.");
            else
                System.out.println(year + " artık yıl değildir.");
        } else if (year % 4 == 0) {
            System.out.println(year + " artık yıldır.");
        } else {
            System.out.println(year + " artık yıl değildir.");
        }
    }
}
