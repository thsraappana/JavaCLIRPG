package items;

public class Armor {
    public String name;
    public int shieldVal;
    public int evasionBonus;

    public Armor(String name, int shieldVal, int evasionBonus) {
        this.shieldVal = shieldVal;
        this.name = name;
        this.evasionBonus = evasionBonus;
    }

    public String toString() {
        return "No armor equipped. Provides no bonuses.";
    }
}
