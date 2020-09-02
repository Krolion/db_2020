package model;

import java.util.Random;

public class Elf extends Hero {
    String[] namesList = {"Galaeron", "Mhaenal", "Rhangyl", "Vaeril",
            "Aimar", "Alen", "Zeno", "Hamon", "Arel", "Malon"};

    public Elf() {
        Random rand = new Random();
        this.hp = 10;
        this.power = 10;
        this.className = "Elf";
        this.personalName = namesList[rand.nextInt(namesList.length)];
    }

    void kick(Hero c) {
        if (c.power < this.power) {
            c.takeDamage(c.hp);
            lastKickDesc = className + " " + personalName + " uses some ancient elf magic " +
                    "and instantly kills his opponent!";
        }
        else {
            c.weaken(1);
            lastKickDesc = className + " " + personalName + " charming his opponent " +
                    "and makes him weaker.";
        }
    }

    boolean isAlive() {
        return hp > 0;
    }

}
