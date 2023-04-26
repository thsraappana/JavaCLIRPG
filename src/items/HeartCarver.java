package items;

public class HeartCarver extends Weapon {
    public HeartCarver() {
        super("Heart Carver", 6, 4, 30);
    }
    String flavorText = "Heart Carver. " + minAttackBonus + " to min attack damage, " + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% to critical strike chance.";

    public String toString() {
        return flavorText;
    }
}
