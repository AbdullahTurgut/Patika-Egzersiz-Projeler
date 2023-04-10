package Giris;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        */
        Scanner scanner = new Scanner(System.in);
        int number, firstTerm = 0, secondTerm = 1;

        System.out.print("Lütfen fibonacci serisi için bir değer giriniz: ");
        number = scanner.nextInt();

        System.out.println("Fibonacci serisi " + number + " \'a kadar ilerler:");

        for (int i = 1; i < number; ++i) {
            // bir sonraki adımı hesapla
            int nextTerm = firstTerm + secondTerm;
            System.out.println(firstTerm + " + " + secondTerm + " = " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
