package GuessTheNumberGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNumber = rand.nextInt(100);
//        int randNumber = (int)(Math.random() * 100);
        int selected;
        int rights = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(randNumber);

        while (rights < 5) {
            System.out.print("Lütfen sayı giriniz: ");
            selected = scanner.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arası bir değer giriniz!");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınız bir azaltılacaktır!");
                }else{
                    System.out.println("Çok fazla hatalı giriş yaptınız!");
                    System.out.println("Kalan hakkınız: " + (5 - ++rights));
                }
                continue; // yanlış girildiyse while döngüsüne tekrar döner.
            }
            if (selected == randNumber) {
                System.out.println("Tebrikler doğru tahmin!!");
                System.out.println("Tahmin ettiğin sayı: " + randNumber);
                isWin = true;
                break;
            } else {
                wrong[rights] = selected;
                rights++;
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > randNumber) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız : " + (5 - rights));
            }

        }

        if (!isWin) {
            System.out.println("Katbettiniz !");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
