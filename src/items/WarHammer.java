package items;

public class WarHammer extends Weapon {
    public WarHammer() {
        super("War Hammer", 12, 0, 0);
    }
    String flavorText = "War Hammer. +12 to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
