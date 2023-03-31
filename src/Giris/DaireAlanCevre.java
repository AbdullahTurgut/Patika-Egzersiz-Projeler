package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
        ve çevresini hesaplayan programı yazın.
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        Alan Formülü : π * r * r
        Çevre Formülü : 2 * π * r
        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        Scanner scanner = new Scanner(System.in);

        int r , a;
        final double Pi = 3.14;
        double cevre , alan , dilimAlan ;

        System.out.print("Lütfen yarı çapı giriniz: ");
        r = scanner.nextInt();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = scanner.nextInt();

        cevre = 2 * Pi * r;
        alan = Pi * (r * r) ;
        dilimAlan = (Pi * (r * r) * a) / 360.0;

        System.out.println("Dairenin çevresi -> " + cevre);
        System.out.println("Dairenin alanı -> " + alan);
        System.out.println("Daire diliminin alanı -> " + dilimAlan);

        scanner.close();


    }
}
