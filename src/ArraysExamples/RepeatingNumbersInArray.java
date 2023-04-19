package ArraysExamples;

public class RepeatingNumbersInArray {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        // Tekrar eden sayıların adedini tutacak bir dizi tanımlıyoruz
        int[] fr = new int[list.length];
        int visited = -1;

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    // Aynı elemanı saymaktan kaçınmak için
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        //Tekrar eden sayıları ve kaç kez tekrar ettiklerini yazdırmak için
        System.out.println("Tekrar Sayıları ");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(list[i] + " sayısı " + fr[i] + " kere tekrar edildi.");
        }
    }
}
