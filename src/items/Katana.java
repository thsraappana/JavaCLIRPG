package items;

public class Katana extends Weapon {
    public Katana() {
        super("Katana", 4, 3, 15);
    }
    String flavorText = "Katana. Weapon used by the warriors of the east. +3 to min attack damage, +4 to max attack damage, 15% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
