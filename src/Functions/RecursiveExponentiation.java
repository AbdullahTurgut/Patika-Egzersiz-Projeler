package Functions;

import java.util.Scanner;

public class RecursiveExponentiation {
    // Java dilinde, taban
    // ve üs değerleri kullanıcıdan alınan üs alma işlemini
    // "Recursive" metot kullanarak yapan programı yazınız.
    static int Exponentiation(int base, int up) {

        if (up == 0) {
            return 1;
        }
        return base * Exponentiation(base, up - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, up;

        System.out.print("Lütfen taban değerini giriniz: ");
        base = scanner.nextInt();

        System.out.print("Lütfen üs değerini giriniz: ");
        up = scanner.nextInt();

        int result = Exponentiation(base, up);

        System.out.println("Sonuç : " + result);
    }
}
