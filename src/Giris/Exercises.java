package Giris;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("We will continue");
    }

    private static void GivenStringQuery() {
    /*
        Input Format
        Read some unknown  lines of input from stdin(System.in)
        until you reach EOF; each line of input contains a non-empty String.

        Output Format
         For each line, print the line number,
         followed by a single space,
         and then the line content received as input.

        Sample Input
        Hello world
        I am a file
        Read me until end-of-file.

        Sample Output
        1 Hello world
        2 I am a file
        3 Read me until end-of-file.
    */
        // Testten geçen kod
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
            String s=sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }

        // bu benim çözüm Test1 de patladık.
//        Scanner scan = new Scanner(System.in);
//        String[] strs = new String[3];
//        strs[0] = scan.nextLine();
//        strs[1] = scan.nextLine();
//        strs[2] = scan.nextLine();
//        for(int i=0;i<strs.length;i++){
//            System.out.println(i+1 + " " + strs[i]);
//        }
    }

    private static void typeLimitsMethod() {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in: ");
                if(x>=-128 && x<=127) {System.out.println("* byte");}
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    private static void LoopExercise1() {
        /*
        *  ilk önce a->0 verildi ve program bir şey döndürmedi.
        *  Daha sonra a->0 b->2 n->10 verildi ve
        *  iterasyondan önce calc = a -> (calc = 0)
        *  1.iterasyon (j = 0 için)
        *  calc += (2^0)*2 -> calc = 0+2 = 2 oldu
        *
        *  2.iterasyon (j = 1 için)
        *  calc += (2^1)*2 -> calc = 2 + 4 = 6 oldu.
        *
        *  iterasyon j < n olduğu için 7 kere daha devam eder ve
        *
        *  final output:
        *  2 6 14 30 62 126 254 510 1022 2046
        *
        * */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        in.close();
    }

    private static void StringAndIntExercise() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            // girilen integer deger 16. yerden başlar bu sayede
            // ve eğer integer 3 haneli değilse başına 0 ekler ve 3 haneye yuvarlar
            System.out.format("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
