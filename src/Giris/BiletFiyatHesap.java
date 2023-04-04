package Giris;

import java.util.Scanner;

public class BiletFiyatHesap {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
        ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
        şeklinde bir uyarı verilmelidir.

        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
        Scanner scan = new Scanner(System.in);
        int age, distance, type;
        double ageDiscount , distanceFare , reducedFare , typeReduced , finalFare;

        System.out.print("Mesafeyi km türünden giriniz: ");
        distance = scan.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scan.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = scan.nextInt();

        if(( distance > 0) && (age > 0) && (type == 1 || type ==2)){
            distanceFare = distance * 0.10;
            if( age < 12 ){
                ageDiscount = distanceFare * 0.5;
                reducedFare = distanceFare - ageDiscount;
                if(type == 2){
                    typeReduced = reducedFare * 0.2;
                    finalFare = (reducedFare - typeReduced ) * 2;
                    System.out.println("Toplam tutar: " + finalFare);
                }else {
                    System.out.println("Toplam tutar: " + reducedFare);
                }
            }else if(age > 12 && age < 24){
                ageDiscount = distanceFare * 0.1;
                reducedFare = distanceFare - ageDiscount;
                if(type == 2){
                    typeReduced = reducedFare * 0.2;
                    finalFare = (reducedFare - typeReduced ) * 2;
                    System.out.println("Toplam tutar: " + finalFare);
                }else {
                    System.out.println("Toplam tutar: " + reducedFare);
                }
            }else if(age > 65){
                ageDiscount = distanceFare * 0.3;
                reducedFare = distanceFare - ageDiscount;
                if(type == 2){
                    typeReduced = reducedFare * 0.2;
                    finalFare = (reducedFare - typeReduced ) * 2;
                    System.out.println("Toplam tutar: " + finalFare);
                }else {
                    System.out.println("Toplam tutar: " + reducedFare);
                }
            }else {
                if(type == 2){
                    typeReduced = distanceFare * 0.2;
                    finalFare = (distanceFare - typeReduced ) * 2;
                    System.out.println("Toplam tutar: " + finalFare);
                }else {
                    System.out.println("Toplam tutar: " + distanceFare);
                }
            }
        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
