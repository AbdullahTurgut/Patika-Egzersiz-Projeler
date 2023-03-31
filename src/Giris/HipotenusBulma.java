package Giris;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aKenar ,bKenar;
        double cKenar;

        System.out.println("Hipotenüs bulan programa hoşgeldin!");
        System.out.println("Lütfen dik üçgenin iki kenar uzunluğunu gir.");

        System.out.print("A kenarı : ");
        aKenar = scanner.nextInt();

        System.out.print("B kenarı: ");
        bKenar = scanner.nextInt();

        cKenar = Math.sqrt((aKenar*aKenar) + (bKenar*bKenar));

        double ucgeninCevresi = aKenar + bKenar + cKenar;
        double u = ucgeninCevresi / 2.0;
        double ucgeninAlani =  u * (u - aKenar) * (u - bKenar) * (u - cKenar);

        System.out.println("Hipotenüs -> " + cKenar);
        System.out.println("Üçgenin çevresi -> " + ucgeninCevresi);
        System.out.println("Üçgenin alanı -> " + ucgeninAlani);

        scanner.close();



    }
}
