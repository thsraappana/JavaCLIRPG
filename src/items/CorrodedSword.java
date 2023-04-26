package items;

public class CorrodedSword extends Weapon {
    public CorrodedSword() {
        super("Corroded Sword", 3, 1, 15);
    }
    String flavorText = "Corroded Sword. Corroded by the slimes acids. +1 to min attack damage, +3 to max attack damage, 15% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
