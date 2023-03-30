package Giris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Egzersiz : Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
        // ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        Scanner scanner = new Scanner(System.in);

        double tutar,kdvTutar,kdvliTutar;
        double kdvOran = 0.18;

        System.out.print("Lütfen TL para değeri giriniz: ");
        tutar = scanner.nextDouble();

        kdvOran = (tutar < 1000) ? 0.18 : 0.8;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutarı: " + kdvliTutar);

    }

    private static void NotOrtalamasi() {
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
