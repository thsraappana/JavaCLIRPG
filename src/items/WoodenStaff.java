package items;

public class WoodenStaff extends Weapon {
    public WoodenStaff() {
        super("Wooden Staff", 2, 2,0);
    }
    String flavorText = "Wooden Staff. A balanced weapon. +2 to min attack damage, +2 to max attack damage";
    public String toString() {
        return flavorText;
    }
}
