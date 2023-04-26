package items;

public class ArmingSword extends Weapon{
    public ArmingSword() {
        super("Arming Sword", 4, 2, 5);
    }
    String flavorText = "Arming Sword. A well crafted sword. +2 to min attack damage, +4 to max attack damage, 5% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
