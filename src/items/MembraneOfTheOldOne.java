package items;

public class MembraneOfTheOldOne extends Armor {
    public MembraneOfTheOldOne() {
        super("Membrane of the Old One",4, 50);
    }
    String flavorText = "Membrane of the Old One. Makeshift armour made from the membrane of the old one. +" + shieldVal +" shield value, " + evasionBonus + "% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
