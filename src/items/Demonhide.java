package items;

public class Demonhide extends Armor{
    public Demonhide() {
        super("Demonhide",7, 10);
    }
    String flavorText = "Demonhide. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
