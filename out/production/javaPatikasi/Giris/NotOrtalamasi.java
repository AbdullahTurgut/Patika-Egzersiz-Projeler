package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, muzik;
        double toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ortalanması alınacak derslerin notlarını giriniz: ");
        System.out.println("Matematik notu : ");
        mat = scanner.nextInt();
        if (mat >= 0 && mat <= 100)
            toplam += mat;

        System.out.println("Fizik notu : ");
        fiz = scanner.nextInt();
        if (fiz >= 0 && fiz <= 100)
            toplam += fiz;

        System.out.println("Türkçe notu : ");
        turk = scanner.nextInt();
        if (turk >= 0 && turk <= 100)
            toplam += turk;

        System.out.println("Kimya notu : ");
        kim = scanner.nextInt();
        if (kim >= 0 && kim <= 100)
            toplam += kim;

        System.out.println("Müzik notu : ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100)
            toplam += muzik;

        double ort = toplam / 5.0;
        System.out.println("Not ortalaması: " + ort);

        if (ort > 55)
            System.out.println("Geçti");
        else
            System.out.println("Kaldı");


    }
}
