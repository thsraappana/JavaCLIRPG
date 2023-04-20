package items;

public class Armor {
    String name;
    int shieldVal;
    int healthModifier;

    public Armor(String name, int shieldVal, int healthModifier) {
        this.shieldVal = shieldVal;
        this.healthModifier = healthModifier;
        this.name = name;
    }

    public int getShieldVal() {
        return shieldVal;
    }

    public int getHealthModifier() {
        return healthModifier;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "No armor equipped";
    }
}
