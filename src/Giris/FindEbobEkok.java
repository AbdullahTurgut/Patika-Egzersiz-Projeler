package Giris;

import java.util.Scanner;

public class FindEbobEkok {
    public static void main(String[] args) {
        /*EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne
        bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
        ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
        18’in bölenleri : 1, 2, 3, 6, 9, 18
        24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
        Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
        EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
        ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
        6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
        8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
        Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
        EKOK = (n1*n2) / EBOB
        */

        Scanner scanner = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, lowOne;
        System.out.print("n1 sayısını giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = scanner.nextInt();

        // EBOB KISMI
        if (n1 < n2)
            lowOne = n1;
        else
            lowOne = n2;

        // küçük olan değere kadar for döngüsü
//        for (int i = 1; i < lowOne; i++) {
//            if (n1 % i == 0 && n2 % i == 0)
//                ebob = i;
//        }
//        System.out.println("Sayıların ebobu -> " + ebob);

        // EBOB 2. YOL KISMI
        // Bu döngü daha az maliyet ile bulur
//        for(int k= lowOne; k>= 1; k--){
//            if(n1 % k == 0 && n2 % k == 0) {
//                ebob = k;
//                break; // ilk bulduğu en büyüktür bu yüzden bulur bulmaz çıktık döngüden
//            }
//        }
//        System.out.println("Sayıların ebobu -> " + ebob);

        // EBOB WHİLE İLE
        int ebobCounter = lowOne;
        while (ebobCounter >=1){
            ebobCounter--;
            if(n1 % ebobCounter == 0 && n2 % ebobCounter == 0) {
                ebob = ebobCounter;
                break; // ilk bulduğu en büyüktür bu yüzden bulur bulmaz çıktık döngüden
            }
        }
        System.out.println("Sayıların ebobu -> " + ebob);

        // EKOK KISMI İÇİN

//        for (int i = 1; i < (n1 * n2); i++) {
//            if (i % n1 == 0 && i % n2 == 0) {
//                ekok = i;
//                break;
//            }
//        }
//        System.out.println("Sayıların ekoku -> " + ekok);

        // EKOK WHİLE İLE
        int ekokCounter = n1*n2,j=1;
        while(j<ekokCounter){
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("Sayıların ekoku -> " + ekok);
    }
}
