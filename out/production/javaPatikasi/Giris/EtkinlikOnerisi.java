package Giris;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        /* Koşullar :
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
            Ödev
            Aynı örnek üzerinden if koşulları başka hangi şekilde
        oluşturulabilirdi farklı çözüm yolları bulunuz.
        */
        Scanner scanner = new Scanner(System.in);
        int heat;

        System.out.print("Günün tavsiyesi için bir sıcaklık değeri giriniz: ");
        heat = scanner.nextInt();

        if(heat < 5){
            System.out.println("Kayak için güzel bir gün...");
        }else if(heat <= 25){
            if(heat > 10){
                System.out.println("Piknik yapabilirsiniz.");
            }
            if(heat < 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        }else
            System.out.println("Bu havada yüzmek iyi gelecektir.");
    }
}
