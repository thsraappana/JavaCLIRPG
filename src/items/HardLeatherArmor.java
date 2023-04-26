package items;

public class HardLeatherArmor extends Armor {
    public HardLeatherArmor() {
        super("Hard Leather Armour",2, 20);
    }
    String flavorText = "Hard Leather Armour. Light to wear making the wearer more nimble, but sturdy enough to provide some defense. " + shieldVal + " shield value " + evasionBonus + " + % evasion chance.";
    public String toString() {
        return flavorText;
    }
}
