package ArraysExamples;

import java.util.Arrays;

public class ArraysClassAndMethods {
    public static void main(String[] args) {
//        HelperArray helperArray = new HelperArray();
//        helperArray.print(list); //Arrays sınıfı ile bu sınıfa gerek kalmadı
        int[] list = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        Arrays.fill(list,10); // arrayin tüm elemanları 10 oldu
        HelperArray.fill(list,20); // Arrays sınıfının methodunu kendi sınıfımızda yazdık
        Arrays.fill(list,1,3,5); // 1 ve 3(dahil değil) arası indexleri 5 yaptık

        Arrays.sort(list); // küçükten büyüğe sıraladık listeyi
        System.out.println(Arrays.toString(list)); // Arrays sınıfı bize kolaylık sağlar

        // **** binarySearch methodunun doğru çalışması
        // için önceden küçükten büyüğe sıralamak gereklidir.****
        System.out.println(Arrays.binarySearch(list,12)); // 12 nin indexini verir(binarySearch -> Arrays sınıfı)
        System.out.println(HelperArray.search(list,25)); // 25 in indexini verir(kendi sınıfımın methodu)

        // ********* copyOf() ve copyOfRange()*************
        int[] copyList = Arrays.copyOf(list,5); // ilk 5 indexi kopyaladık
        int[] copyList2 = Arrays.copyOf(list, list.length); // tüm elemanları kopyalar

        // aralık için copyOfRange()
        int[] copyOfRangeList = Arrays.copyOfRange(list,3,6); // 6 dahil değil
        System.out.println(Arrays.toString(copyList));
        System.out.println(Arrays.toString(copyList2));
        System.out.println(Arrays.toString(copyOfRangeList));


        // equals() methodu listeler eşitse 'true' değilse 'false'
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false
        System.out.println(HelperArray.equals(list1,list2)); // kendi methodumuz 'true'
    }
}
