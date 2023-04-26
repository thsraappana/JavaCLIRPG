package items;

public class WoodCuttingAxe extends Weapon{
    public WoodCuttingAxe() {
        super("Wood Cutting Axe", 3, 0, 0);
    }
    String flavorText = "A Wood Cutting Axe. Not typically used as a weapon. +3 to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
