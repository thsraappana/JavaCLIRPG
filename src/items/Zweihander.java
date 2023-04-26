package items;

public class Zweihander extends Weapon{
    public Zweihander() {
        super("Zweihander", 8, 6, 0);
    }
    String flavorText = "Zweihander. Huge sword, requires both hands to use effectively. +6 to min attack damage, +8 to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
