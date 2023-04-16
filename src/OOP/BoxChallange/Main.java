package OOP.BoxChallange;

public class Main {
    public static void main(String[] args) {
        // Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

        Fighter f1 = new Fighter("Kawaki", 10,150,100,15);
        Fighter f2 = new Fighter("Tanjiro",15,130,90,18);

        Challange challange = new Challange(f1,f2,90,100);

        challange.run();
    }
}
