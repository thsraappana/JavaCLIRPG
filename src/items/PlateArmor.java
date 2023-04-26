package items;

public class PlateArmor extends Armor{
    public PlateArmor() {
        super("Plate Armour",6, 0);
    }
    String flavorText = "Plate Armour. +" + shieldVal + " shield value.";
    public String toString() {
        return flavorText;
    }
}
