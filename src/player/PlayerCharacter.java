package player;

import items.Armor;
import items.Weapon;
import monsters.Monster;

import java.util.Random;
import java.util.Scanner;

public class PlayerCharacter {
    int[] expTable = {0, 3, 6, 10, 18, 30};
    public String charName;
    public String charJob;

    // starting values
    public int health = 10;
    public int maxHealth = 10;
    public int minAttackVal = 1;
    public int maxAttackVal = 3;
    public int critChance = 0;
    public int playerLevel = 0;
    public int playerExp = 0;
    public boolean isClassAbilityUsed = false;
    public int evasion = 0;
    public PassiveEffect[] passiveEffects = {};
    public Weapon equippedWeapon = new Weapon("Fists", 0, 0, 0, 0, Weapon.SpecialAbilities.NONE);
    public Armor equippedArmor = new Armor("Unarmored", 0, 0);
    
    public PlayerCharacter(String name, String job) {
        charName = name;
        charJob = job;
    }

    public void equipWeapon(Weapon weapon) {
        equippedWeapon = weapon;
    }

    public void equipArmor(Armor armor) {
        equippedArmor = armor;
    }

    public String getEquippedArmor() {
        return equippedArmor.name;
    }

    public String getEquippedWeapon() {
        return equippedWeapon.name;
    }

    public String getExp() {
        int nextLevel = expTable[playerLevel + 1];
        return "Experience needed for next level: " + playerExp + "/" + nextLevel;
    }

    public int getBaseDmg() {
        Random random = new Random();
        int minDmg = minAttackVal + equippedWeapon.minAttackBonus;
        int maxDmg = maxAttackVal + equippedWeapon.maxAttackBonus;
        int attackDamage = random.nextInt(maxDmg - minDmg + 1) + minDmg;
        return attackDamage;
    }

    public void basicAttack(Monster encounterMonster) {
        int attackDamage = getBaseDmg();
        System.out.println("You swing at the " + encounterMonster.name + " with your " + this.getEquippedWeapon() + " dealing " + attackDamage + " damage!");
        encounterMonster.takeDamage(attackDamage);
    }

    public void specialAbility(Monster encounterMonster) {}

    public void gainExp(int exp) {
        int nextLevel = playerLevel + 1;
        playerExp += exp;
        System.out.println("\nYou receive " + exp + " experience.");
        if (playerExp >= expTable[nextLevel]) {
            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("DING! Congratulations you leveled up. Stats have increased. You will also face tougher monsters in the dungeon now!");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            playerExp = 0;
            playerLevel += 1;
            maxHealth += 3;
            minAttackVal += 1;
            maxAttackVal += 2;
            health = maxHealth;
        }
        if (this.playerLevel == 5) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("You reached Level 5! Congrats on beating the game!");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.exit(0);
        }

    }

    public void takeDamage(int damage) {
        int shieldVal = equippedArmor.shieldVal;
        int damageTaken = damage - shieldVal;
        if (shieldVal > 0) {
            System.out.println("Your armor protected you for " + shieldVal + " damage, " + "You took " + damageTaken + " damage!");
        }
        health -= damageTaken;
        if (health < 1) {
            playerDeath();
        }
    }

    public void playerDeath() {
        System.out.println("You have died!");
        System.exit(0);
    }

    public void equipChoice(Object randomItem, Scanner scanner) {
        System.out.println("\nEquip dropped item (yes/no)?");
        System.out.println("Type (info) to get information about your currently equipped items");
        String lootScanner = scanner.nextLine();
        if (lootScanner.equals("info")) {
            System.out.println("Current weapon: " + equippedWeapon);
            System.out.println("Current armor: " + equippedArmor);
            equipChoice(randomItem, scanner);
        } else if (lootScanner.equals("yes")) {
            if (randomItem.getClass().getSuperclass() == Armor.class) {
                System.out.println("New armor equipped!");
                equipArmor((Armor) randomItem);
            }
            if (randomItem.getClass().getSuperclass() == Weapon.class) {
                System.out.println("New weapon equipped!");
                equipWeapon((Weapon) randomItem);
            }
        }
    }

    public String toString() {
        return "This characters name is: " + charName + " and Class is: " + charJob;
    }
}
