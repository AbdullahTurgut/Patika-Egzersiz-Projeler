package ArraysExamples;

public class HelperArray {
    // static koyarsak başına nesne üretmeden ulaşabilirz
    // HelperArray.print() gibi

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    // Arrays.binarySearch methodunu kendimiz yazdık
    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value)
                return i;
        }
        return -1;
    }

    // Arrays sınıfının equals() methodu
    static boolean equals(int[] arr,int[] arr2){
        // boyutlar eşit değilse false
        if( arr.length != arr2.length)
            return false;

        // boyutlar eşitse elemanlara bakılır
        for(int i= 0; i< arr.length;i++){
            if( arr[i] != arr2[i])
                return false; // eleman eşit değilse 'false'
        }
        return true; // yukarıdaki methodlar çalışmazsa eşittir. 'true'
    }
}
