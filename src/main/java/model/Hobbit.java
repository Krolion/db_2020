package model;

import java.util.Random;

public class Hobbit extends Hero {
    String[] namesList = {"Erzor", "Yarace", "Idokas", "Idozin", "Pimvias",
            "Teace", "Ulhace", "Irary", "Yenster", "Corhace"};

    public Hobbit() {
        Random rand = new Random();
        this.hp = 3;
        this.power = 0;
        this.className = "Hobbit";
        this.personalName = namesList[rand.nextInt(namesList.length)];
    }

    void kick(Hero c) {
        lastKickDesc = className + " " + personalName + " sits down and starts crying. It's not" +
                " very effective!";
    }

    boolean isAlive() {
        return hp > 0;
    }
}
