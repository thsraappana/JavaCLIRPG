package items;

public class MilitaryPick extends Weapon{
    public MilitaryPick() {
        super("Military Pick", 3, 2, 10);
    }
    String flavorText = "Military Pick. +2 to min attack damage, +3 to max attack damage, 10% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
