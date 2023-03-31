package Giris;

import java.util.Scanner;

public class ManavToplamFiyatHesap {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

 */
        Scanner scanner = new Scanner(System.in);
        double armutFiyat = 2.14, elmaFiyat = 3.67, domFiyat = 1.11, muzFiyat = 0.95, toplam = 0;
        int miktar;

        System.out.print("Armut kaç kilo?: ");
        miktar = scanner.nextInt();
        toplam += miktar * armutFiyat;

        System.out.print("Elma kaç kilo?: ");
        miktar = scanner.nextInt();
        toplam += miktar * elmaFiyat;

        System.out.print("Domates kaç kilo?: ");
        miktar = scanner.nextInt();
        toplam += miktar * domFiyat;

        System.out.print("Muz kaç kilo?: ");
        miktar = scanner.nextInt();
        toplam += miktar * muzFiyat;

        System.out.println(toplam);
    }
}
