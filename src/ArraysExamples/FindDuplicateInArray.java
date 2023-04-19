package ArraysExamples;

import java.util.Arrays;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] list = {3, 7, 8, 6, 12, 8, 15, 6, 12, 24, 10, 24};
        int[] duplicate = new int[list.length];
        int startIndex=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] % 2 == 0 && list[j] % 2 == 0) {
                    if (list[i] == list[j]) {
                        duplicate[startIndex++] = list[i];
                        System.out.println(list[i] + " çift ve tekrar etmiştir.");
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(duplicate));
    }
}
