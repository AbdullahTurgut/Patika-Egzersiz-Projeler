package Giris;

import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main(String[] args) {

     /*
          Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
          Taksimetre KM başına 2.20 TL tutmaktadır.
          Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
          Taksimetre açılış ücreti 10 TL'dir.
    */
        Scanner scanner = new Scanner(System.in);
        int mesafe;
        double tutar;
        System.out.print("Lütfen mesafeyi kilometre cinsinden giriniz: ");
        mesafe = scanner.nextInt();
        tutar = 10 + (mesafe * 2.20);
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Ödenecek yol ücreti: " + tutar);

        scanner.close();
    }



}
