package items;

public class WornArmor extends Armor {
    public WornArmor() {
        super("Worn Armour",1, 0);
    }
    String flavorText = "Worn Armour. Provides a small defense against attacks. +1 to shield value.";
    public String toString() {
        return flavorText;
    }
}
