package items;

public class WornArmor extends Armor {
    public WornArmor() {
        super("Worn Armor",1, 0);
    }
    String flavorText = "A well worn armor. Provides a small defense against attacks. +1 to shield value.";
    public String toString() {
        return flavorText;
    }
}