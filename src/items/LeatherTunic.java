package items;

public class LeatherTunic extends Armor{
    public LeatherTunic() {
        super("Leather Tunic",0, 15);
    }
    String flavorText = "Leather Tunic. Light to wear making the wearer more nimble. 15% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
