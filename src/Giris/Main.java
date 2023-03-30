package Giris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Egzersiz : Not ortalaması bulan program

        int mat,fiz,kim,turk,tarih,muzik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ortalanması alınacak derslerin notlarını giriniz: ");
        System.out.println("Matematik notu : ");
        mat = scanner.nextInt();
        System.out.println("Fizik notu : ");
        fiz = scanner.nextInt();
        System.out.println("Kimya notu : ");
        kim = scanner.nextInt();
        System.out.println("Türkçe notu : ");
        turk = scanner.nextInt();
        System.out.println("Tarih notu : ");
        tarih = scanner.nextInt();
        System.out.println("Müzik notu : ");
        muzik = scanner.nextInt();

        double ort = (mat + fiz + kim + tarih + turk + muzik) / 6.0;
        String sonuc = (ort > 60) ? "Geçti" : "Kaldı";
        System.out.println("Ortalama " + ort + " \'dır");
        System.out.println("Sonuc : " + sonuc );



    }
}
