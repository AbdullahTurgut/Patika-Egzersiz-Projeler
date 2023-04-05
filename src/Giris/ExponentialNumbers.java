package Giris;

import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan
        4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        */
        Scanner scanner = new Scanner(System.in);
        int number;
        int fourExponential=1;
        int fiveExponential=1;
        System.out.print("Lütfen bir sayı giriniz: ");
        number = scanner.nextInt();

        for(int i = 1; i<number;i++){
            System.out.printf("4^%d -> %d%n",i,fourExponential *= 4);
        }
        // -------------

        for(int i = 1; i<number;i++){
            System.out.printf("5^%d -> %d%n",i,fiveExponential *= 5);
        }
    }
}
