package MathPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100)); // abs -> mutlak değer
        System.out.println(Math.ceil(1.0001)); // ceil -> bir üst tam sayıya yuvarlar
        System.out.println(Math.floor(1.99)); // bir alt tam sayıya yuvarlar
        System.out.println(Math.pow(2,3)); // pow -> 2^3 işlemini yapar
        System.out.println(Math.random() * 10 ); // 0 ile 10 arasında bir sayı döndürür(double)
        System.out.println(Math.round(10.49)); // round -> 0.5 den büyük küçük olma durumuna göre yuvarlama yapar
    }
}
