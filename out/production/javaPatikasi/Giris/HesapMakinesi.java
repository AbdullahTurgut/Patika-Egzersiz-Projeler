package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        // Basit Hesap makinesi

        Scanner scanner = new Scanner(System.in);

        int a , b;
        System.out.println("Lütfen sayı giriniz");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlem methodunu seçin:");
        System.out.println(
                String.format("Toplama için '+' \nÇıkarma için '-'\nÇarpma için '*'\nBölme için '/' ")
        );

        String operator = scanner.next();

        switch (operator){
            case "+":
                System.out.println("Sonuç = " + (a+b));
                break;
            case "-":
                System.out.println("Sonuç = " + (a-b));
                break;
            case "*":
                System.out.println("Sonuç = " + (a*b));
                break;
            case "/":
                if( a != 0 && b != 0 ){
                    System.out.println("Sonuç = " + (a/b));
                }else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Geçersiz operatör girdiniz!");
        }

    }
}
