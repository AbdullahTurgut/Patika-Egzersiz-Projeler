package ArraysExamples;

public class Main {
    public static void main(String[] args) {
        // 10 20 30 40 50 60 70 80 90 100 -> dizisi oluşturacağız
        int[] list = new int[10];
//        System.out.println(list.length); // output -> 10
//        for (int i = 0; i < list.length; i++) {
//            list[i] = i * 10 + 10;
//            System.out.print(list[i] + " ");
//        }
        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8}; // bu şekilde girilen eleman kadar boyut oluşturur.
        printArray(list2);
        System.out.println();
        int[] list2Reverse = reverseList(list2);
        printArray(list2Reverse);
    }
    // girilen listeyi ters çeviren method
    static int[] reverseList(int[] arr) {
        int[] reverseArray = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reverseArray[i] = arr[j];
        }
        return reverseArray;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
