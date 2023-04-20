import items.Armor;
import items.Weapon;

public class PlayerCharacter {
    public static Object equipWeapon;
    String charName;
    String charClass;

    // starting values
    int health = 10;
    int maxHealth = 10;
    int minAttackVal = 1;
    int maxAttackVal = 3;
    int critChance = 0;
    int shieldVal = 0;
    int playerLevel = 0;
    boolean classAbilityUsed = false;

    Weapon equippedWeapon = new Weapon("Fists", 0, 0, 0, 0, Weapon.SpecialAbilities.NONE);
    Armor equippedArmor = new Armor("Unarmored", 0, 0);
    
    public PlayerCharacter(String name, String pClass) {
        charName = name;
        charClass = pClass;
    }

    public void equipWeapon(Weapon weapon) {
        equippedWeapon = weapon;
    }

    public void equipArmor(Armor armor) {
        equippedArmor = armor;
    }

    public void levelUp() {
        playerLevel += 1;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getEquippedArmor() {
        return equippedArmor.getName();
    }

    public String getEquippedWeapon() {
        return equippedWeapon.getName();
    }

    public int getMinAttackVal() {
        return minAttackVal + equippedWeapon.getMinAttackBonus();
    }

    public int getMaxAttackVal() {
        return maxAttackVal + equippedWeapon.getMaxAttackBonus();
    }

    public boolean isClassAbilityUsed() {
        return classAbilityUsed;
    }

    public String toString() {
        return "This characters name is: " + charName + " and Class is: " + charClass;
    }
}
