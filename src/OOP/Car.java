package OOP;

public class Car {
    // Nitelikleri belirledik
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 220;
    /*
        Constructor (Kurucu) Metotlar
        Kurucu metotlar sınıf tasarlanırken yazılırlar. Sınıfınızı yazarken
        kurucu metotlarınızı da tanımlayabilirsiniz. Eğer sınıf içinde hiç kurucu metot
        tanımlamazsınız parametresiz boş bir kurucu metot Java tarafından otomatik olarak tanımlanır.

        Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne
        üretme aşamasında çalıştırılan özel metotlardır (fonksiyonlardır).
        Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.
        Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.

        "new" anahtar kelimesi ile nesne üretirken kurucu metot çağrımı yapılır.
        İki tip kurucu metot vardır:

        Parametresiz Varsayılan Kurucu Metot
        Parametreli Kurucu Metot
     */

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    //Davranışlar
    // 1- arabanın hızını arttıracak metod

    void increaseSpeed(int increment) {
        this.speed += increment;
    }

    // 2- arabanın hızını azaltacak metod
    void decreaseSpeed(int decreasement) {
        if (this.speed > 0)
            this.speed -= decreasement;

    }

    void printSpeed() {
        System.out.println("Hızınız: " + this.speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }

}
