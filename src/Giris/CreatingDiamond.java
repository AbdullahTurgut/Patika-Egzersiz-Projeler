package Giris;

import java.util.Scanner;

public class CreatingDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd = 1, n;
        System.out.println("Bir sayı giriniz:");
        n = scanner.nextInt();
        int numberOfSpaces = n / 2;

        for (int i = 1; i <= n; i++) { // for number of rows i.e n rows
            for (int k = numberOfSpaces; k >= 1; k--) { // for number of spaces i.e
                // 3,2,1,0,1,2,3 and so on
                System.out.print(" ");
            }
            for (int j = 1; j <= odd; j++) { // for number of columns i.e
                // 1,3,5,7,5,3,1
                System.out.print("*");
            }
            System.out.println();
            if (i < n/2+1) {
                odd += 2; // columns increasing till center row
                numberOfSpaces -= 1; // spaces decreasing till center row
            } else {
                odd -= 2; // columns decreasing
                numberOfSpaces += 1; // spaces increasing
            }
        }
    }
}
