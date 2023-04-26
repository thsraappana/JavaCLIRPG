package items;

public class AncientArmor extends Armor {
    public AncientArmor() {
        super("Ancient Armour",8, 0);
    }
    String flavorText = "Ancient Armour. +" + shieldVal +" shield value.";
    public String toString() {
        return flavorText;
    }
}
