package items;

public class GhostSpear extends Weapon{
    public GhostSpear() {
        super("Ghost Spear", 8, 6, 15);
    }
    String flavorText = "Ghost Spear. " + minAttackBonus + " to min attack damage, " + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% to critical strike chance.";

    public String toString() {
        return flavorText;
    }
}
