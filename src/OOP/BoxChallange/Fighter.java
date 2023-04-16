package OOP.BoxChallange;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double fighterSpeed; //  şimdilik default olarak 50 altında olduğu düşünelecek

    // constructor
    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        // dodge değerinin 100 ün üstünde girilmesini engellemek için
        if (dodge >= 0 && dodge < 100) {
            this.dodge = dodge;
        } else
            this.dodge = 0;
    }

    // rakibin verdiği hasarı işleyecek metod
    int hit(Fighter foe) {
        // foe karşıt anlamında
        if (foe.isDodge()) {
            System.out.println(this.name + " vurdu. " + foe.name + " hasardan kaçındı!");
            return foe.health;
        } else
            System.out.println(this.name + " -> " + foe.name + " " + this.damage + " hasar vurdu.");


        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    // Hızlı olan dövüşçünün karşılaşmaya ilk başlamasını sağlayacak metod
    double FasterFighterSpeed(Fighter foe) {
        foe.fighterSpeed = Math.random() * 50;
        return foe.fighterSpeed;
    }

    boolean isDodge() {
        // 0 dan 100 e kadar double türünde random sayı üreticez
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
