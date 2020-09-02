package model;

public class GameManager {
    void fight(Hero c1, Hero c2) {
        System.out.println("Our heroes, " + c1.generateDescription() + " and " + c2.generateDescription() +
                ", start a fight!");
        if (!c1.isAlive() & !c2.isAlive()) {
            System.out.println("Unfortunately, they are both dead, so fight is kind of boring.");
            return;
        }
        if (!c1.isAlive() | !c2.isAlive()) {
            if (c1.isAlive()) {
                System.out.println(c1.fullName() + " comes to the fight and finds out that " +
                        c2.fullName() + " is already dead. Look like " + c1.fullName() + " would live" +
                        " another day (or at least till the other fight).");
            } else {
                System.out.println(c2.fullName() + " comes to the fight and finds out that " +
                        c1.fullName() + " is already dead. Look like " + c2.fullName() + " would live" +
                        " another day (or at least till the other fight).");
            }
            return;
        }
        while (c1.isAlive() & c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
            System.out.println(c1.lastKickDesc);
            System.out.println(c2.lastKickDesc);
        }
        if (!c1.isAlive() & !c2.isAlive()) {
            System.out.println("Look like our heroes just killed each other! Seems like violence in " +
                    "fairytale is as pointless as in real life.");
        }
        else {
            if (c1.isAlive()) {
                System.out.println("It's a sweet victory for " + c1.fullName() + "! But for how long?");
            }
            else {
                System.out.println("It's a sweet victory for " + c2.fullName() + "! But for how long?");
            }
        }
    }

    public static void main(String[] args) {
        GameManager battlefield = new GameManager();
        HeroFactory smalltown = new HeroFactory();
        Hero h1 = smalltown.createRandomHero();
        Hero h2 = smalltown.createRandomHero();
        battlefield.fight(h1, h2);
    }
}
