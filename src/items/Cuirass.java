package items;

public class Cuirass extends Armor {
    public Cuirass() {
        super("Cuirass",3, 10);
    }
    String flavorText = "Cuirass. +" + shieldVal + "  shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
