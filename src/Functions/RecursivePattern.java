package Functions;

import java.util.Scanner;

public class RecursivePattern {
    // Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki
    // kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    //
    //Kural : Girilen sayı 0 veya negatif olduğu yere kadar
    // girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
    // ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

    static void patternOne(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            patternOne(number - 5, temp);
        } else
            patternTwo(number, temp);

    }

    static void patternTwo(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            patternTwo(number + 5, temp);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, temp;

        System.out.print("Sayı Gir: ");
        number = input.nextInt();

        temp = number;
        patternOne(number, temp);
    }
}
