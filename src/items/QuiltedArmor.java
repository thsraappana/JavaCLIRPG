package items;

public class QuiltedArmor extends Armor{
    public QuiltedArmor() {
        super("Quilted Armor",2, 5);
    }
    String flavorText = "Quilted Armor. +2 shield value, 5% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
