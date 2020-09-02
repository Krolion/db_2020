package model;

import java.util.Random;

public class King extends Human {

    public King() {
        Random rand = new Random();
        this.hp = 2 + rand.nextInt(14);
        this.power = 2 + rand.nextInt(14);
        this.className = "King";
        this.personalName = namesList[rand.nextInt(namesList.length)];
    }
}
