package Giris;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        /*
         1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız
         Not: kendi ve 1'e bölünebilen sayılar asal sayılardır
         */
        int counter = 0;
        for(int number=2;number<=100;number++)
        {
            int check = 0;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    check = 1;
                    break;
                }
            }

            if(check==0)
            {
                System.out.print(number+" ");
                counter++;
            }
        }
    }
}
