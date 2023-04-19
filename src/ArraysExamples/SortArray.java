package ArraysExamples;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listSize;

        System.out.print("Dizi boyutunu giriniz : ");
        listSize = scanner.nextInt();

        int[] list = new int[listSize];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Eleman : ");
            list[i] = scanner.nextInt();
        }

        // 1.yol
        int replacer;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    replacer = list[i];
                    list[i] = list[j];
                    list[j] = replacer;
                }
            }
        }

//        Arrays.sort(list); // Arrays sınıfı kullanarak basit bir şekilde küçükten büyüğe sıralayabiliriz
        System.out.println(Arrays.toString(list));
    }
}
