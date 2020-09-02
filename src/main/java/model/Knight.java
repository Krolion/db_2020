package model;

import java.util.Random;

public class Knight extends Human {

    public Knight() {
        Random rand = new Random();
        this.hp = 2 + rand.nextInt(11);
        this.power = 2 + rand.nextInt(11);
        this.className = "Knight";
        this.personalName = namesList[rand.nextInt(namesList.length)];
    }
}
