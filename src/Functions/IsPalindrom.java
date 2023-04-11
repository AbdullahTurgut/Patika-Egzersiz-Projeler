package Functions;

public class IsPalindrom {
    static boolean isPalindrom(int n) {

        int temp = n, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (n == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        /*
        Palindrom Sayı Nedir ?
        Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889...
         */
        System.out.println(isPalindrom(99));

    }
}
