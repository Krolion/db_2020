package model;

import java.util.Random;


abstract public class Human extends Hero {
    String[] namesList = {"John", "Edward", "Gans", "Jonatan",
            "Peter", "Michael", "Ernest", "Richard", "Pavel", "Caesar"};

    void kick(Hero c) {
        Random rand = new Random();
        int kickPower = rand.nextInt(this.power);
        c.takeDamage(kickPower);
        lastKickDesc = className + " " + personalName + ((kickPower == 0) ? " do nothing to " :
                (kickPower < 3) ? " slightly scratch " : (kickPower < 7) ? " slash " : " make a powerful" +
                        " blow to ") + "his opponent";
    }

    boolean isAlive() {
        return (hp > 0);
    }
}
