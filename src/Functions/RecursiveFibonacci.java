package Functions;

public class RecursiveFibonacci {
    static int recFib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return recFib(number - 1) + recFib(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(recFib(5));
    }
}
