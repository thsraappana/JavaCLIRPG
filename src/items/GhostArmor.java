package items;

public class GhostArmor extends Armor{
    public GhostArmor() {
        super("Ghost Armor",6, 20);
    }
    String flavorText = "Ghost Armor. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
