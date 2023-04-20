package items;

public class WoodenStaff extends Weapon {
    public WoodenStaff() {
        super("Wooden Staff", 3, 0,0,0,SpecialAbilities.NONE);
    }
    String flavorText = "A wooden staff. Surprisingly heavy, making it ideal as a striking weapon. +3 to max attack damage";
    public String toString() {
        return flavorText;
    }
}