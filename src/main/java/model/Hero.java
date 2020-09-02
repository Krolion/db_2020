package model;

abstract public class Hero {
    String lastKickDesc;
    String personalName;
    String className;
    int power;
    int hp;

    abstract void kick(Hero c);

    abstract boolean isAlive();

    String generateDescription() {
        String fullName = className + " " + personalName;
        String bodyType = (hp <= 0) ? "dead" : (hp < 5) ? "feeble" : (hp < 11) ?
                "healthy" : "tough";
        String strength = (power <= 0) ? "helpless" : (power < 5) ? "weak" :
                (power < 11) ? "strong" : "powerful";
        return fullName + ", " + bodyType + " and " + strength;
    }

    void takeDamage(int damage) {
        hp-=damage;
    }

    void weaken(int value) {
        power-=value;
    }

    String fullName() {
        return className + " " + personalName;
    }
}
