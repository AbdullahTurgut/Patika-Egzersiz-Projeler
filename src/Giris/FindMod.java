package Giris;

import java.util.Scanner;

public class FindMod {
    public static void main(String[] args) {
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen
        sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        */

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0 , counter = 0;
        double ort;

        System.out.print("Bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i  % 4 == 0 && i % 3 == 0) {
                toplam += i;
                counter++;
            }
        }
        ort = (double) toplam / counter;
        System.out.println("Girilen sayıya kadar 3'e ve 4'e bölünebilen sayıların ortalaması:\n" + ort);



    }
}
