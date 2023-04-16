package OOP.BoxChallange;

public class Challange {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // constructor

    public Challange(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // run methodu
    void run() {
        if (isCheck()) {
            // sporcular sırayla birbirine hasar vericek
            // sonuc bilinmediği için while döngüsü ile kodlanmalı
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("----YENI ROUND----");

                this.f1.fighterSpeed = this.f1.FasterFighterSpeed(f1);
                this.f2.fighterSpeed = this.f2.FasterFighterSpeed(f2);
                if(this.f1.fighterSpeed >= this.f2.fighterSpeed){
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                }else{
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                }
                // round sonunda kalan canlar
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                System.out.println();
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    private boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }

        return false;
    }
}
