package Giris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {
        /*ava ile klavyeden girilen N tane sayma sayısından
        en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22
         */
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, n4;
        List<Integer> numberList = new ArrayList<>(); // sayılar için dizi oluşturuldu

        System.out.print("n1 sayısını giriniz: ");
        n1 = scanner.nextInt();
        numberList.add(n1); // n1 diziye atandı

        System.out.print("n2 sayısını giriniz: ");
        n2 = scanner.nextInt();
        numberList.add(n2); // n2 diziye atandı

        System.out.print("n3 sayısını giriniz: ");
        n3 = scanner.nextInt();
        numberList.add(n3); // n3 diziye atandı

        System.out.print("n4 sayısını giriniz: ");
        n4 = scanner.nextInt();
        numberList.add(n4); // n4 diziye atandı

        int min = numberList.get(0);
        int max = numberList.get(0);
        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i) < numberList.get(i + 1)) {
                min = numberList.get(i);
                break;
            }
        }

        for (int j = 0; j < numberList.size() - 1; j++) {
            if (numberList.get(j) < numberList.get(j + 1)) {
                max = numberList.get(j + 1);
            }
        }
        System.out.println("Girilen sayılardan en büyüğü -> " + max);
        System.out.println("Girilen sayılardan en küçüğü -> " + min);
    }
}
