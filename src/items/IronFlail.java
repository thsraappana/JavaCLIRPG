package items;

public class IronFlail extends Weapon {
    public IronFlail() {
        super("Iron Flail", 3, 1, 0);
    }
    String flavorText = "Iron Flail. +1 to min attack damage, +3 to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
