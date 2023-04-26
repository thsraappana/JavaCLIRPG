package items;

public class RingMail extends Armor{
    public RingMail() {
        super("Ring Mail",4, 15);
    }
    String flavorText = "Ring Mail. +" + shieldVal + " shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
