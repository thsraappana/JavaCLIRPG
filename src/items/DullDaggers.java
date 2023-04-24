package items;

public class DullDaggers extends Weapon {
    public DullDaggers() {
        super("Dull Daggers", 0, 1, 10, 0, SpecialAbilities.NONE);
    }
    String flavorText = "Dull Daggers. These daggers have seen some use. +1 to min attack damage, 10% increased critical strike chance.";

    public String toString() {
        return flavorText;
    }
}
