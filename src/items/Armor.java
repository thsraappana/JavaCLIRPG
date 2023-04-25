package items;

public class Armor {
    public String name;
    public int shieldVal;
    public int healthModifier;

    public Armor(String name, int shieldVal, int healthModifier) {
        this.shieldVal = shieldVal;
        this.healthModifier = healthModifier;
        this.name = name;
    }

    public String toString() {
        return "No armor equipped. Provides no bonuses.";
    }
}
