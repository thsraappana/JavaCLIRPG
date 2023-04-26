package items;

public class CorrodedArmor extends Armor{
    public CorrodedArmor() {
        super("Corroded Armour",1, 10);
    }
    String flavorText = "Corroded Armour. Corroded by the slimes acids. +1 to shield value, 10% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
