package monsters;

import player.PlayerCharacter;

import java.util.Random;

public class Monster {
    public String name;
    public int health;
    public int minDamageVal;
    public int maxDamageVal;
    public int minPlayerLevel;
    public int expYielded;
    public boolean stunned = false;

    public Monster(String name, int health, int minDamageVal, int maxDamageVal, int minPlayerLevel, int expYielded) {
        this.name = name;
        this.health = health;
        this.minDamageVal = minDamageVal;
        this.maxDamageVal = maxDamageVal;
        this.minPlayerLevel = minPlayerLevel;
        this.expYielded = expYielded;
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

    public int basicAttack() {
        Random random = new Random();
        int attackDamage = random.nextInt(this.maxDamageVal - this.minDamageVal + 1) + this.minDamageVal;
        return attackDamage;
    }
    public void attack(PlayerCharacter playerCharacter) {}
}
