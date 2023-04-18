package ArraysExamples;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxCloseInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {1, 3, 5, 8, 12, 18};
        Arrays.sort(list);

        int number;
        int minClosed = 0;
        int maxClosed = 0;

        System.out.print("Sayı giriniz: ");
        number = scanner.nextInt();

        for (int i : list) {
            if (i < number && i > minClosed)
                minClosed = i;
        }

        for(int i : list){
            if( i > number) {
                maxClosed = i;
                break;
            }
        }

        System.out.println("Girilen sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minClosed);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxClosed);
    }
}
