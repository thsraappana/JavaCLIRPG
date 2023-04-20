package monsters;

public class Monster {
    String name;
    int health;
    int minDamageVal;
    int maxDamageVal;
    int minPlayerLevel;

    public Monster(String name, int health, int minDamageVal, int maxDamageVal, int minPlayerLevel) {
        this.name = name;
        this.health = health;
        this.minDamageVal = minDamageVal;
        this.maxDamageVal = maxDamageVal;
        this.minPlayerLevel = minPlayerLevel;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String toString() {
        return name + "! Health: " + health + ", Attack: " + minDamageVal + "-" + maxDamageVal;
    }
}
