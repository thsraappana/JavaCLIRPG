package items;

public class ChainMail extends Armor{
    public ChainMail() {
        super("Chain Mail",2, 15);
    }
    String flavorText = "Chain Mail. Light enough to stay agile, but the chain links provide some defense as well. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
