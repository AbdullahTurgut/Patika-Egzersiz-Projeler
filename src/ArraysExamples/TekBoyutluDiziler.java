package ArraysExamples;

public class TekBoyutluDiziler {
    public static void main(String[] args) {
        double[] list1 = new double[20];
        String[] days = {"Pzrtesi", "Salı", "Çarşamba"};
        String[] weekendDays = new String[]{"Cumartesi", "Pazar"};
        days[1] = "Perşembe";
        System.out.println(days.length);

        for(int i=0;i<days.length;i++){
            System.out.println(days[i]);
        }
    }
}
