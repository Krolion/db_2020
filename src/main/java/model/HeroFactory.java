package model;

import java.util.Random;

public class HeroFactory {
    Hero createRandomHero() {
        Random rand = new Random();
        int r = rand.nextInt(4);
        Hero hero = (r == 0) ? new Elf() : (r == 1) ? new King() :
                (r == 2) ? new Knight() : new Hobbit();
        return hero;
    }
}
