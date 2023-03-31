package Giris;

import java.util.Scanner;

public class BoyKutleEndexi {
    public static void main(String[] args) {
        /*
             Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
             Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
             Formül ->  Kilo (kg) / Boy(m) * Boy(m)
             Çıktısı
                Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
                Lütfen kilonuzu giriniz : 105
                Vücut Kitle İndeksiniz : 35.49215792320173
        */

        Scanner scanner = new Scanner(System.in);
        double boy, kilo , endex;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        endex = kilo / (boy * boy);

        System.out.println("Boy kütle endexsiniz : " + endex);

        System.out.println(boy + " " + kilo);

        scanner.close();
    }
}
