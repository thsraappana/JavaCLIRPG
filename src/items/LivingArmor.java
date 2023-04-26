package items;

public class LivingArmor extends Armor{
    public LivingArmor() {
        super("Living Armour",5, 30);
    }
    String flavorText = "Living Armour. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
