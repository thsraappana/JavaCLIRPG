package items;

public class RatTailWhip extends Weapon {
    public RatTailWhip() {
        super("Rat Tail Whip", 2, 0, 5);
    }
    String flavorText = "Rat Tail Whip. Makeshift weapon. +2 to max attack damage, 5% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
