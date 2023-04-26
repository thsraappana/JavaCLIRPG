package items;

public class DragonScaleArmor extends Armor {
    public DragonScaleArmor() {
        super("Dragon Scale Armour",10, 0);
    }
    String flavorText = "Dragon Scale Armour. Armour made from scales of the dragon. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
