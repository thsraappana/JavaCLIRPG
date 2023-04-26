package items;

public class SkullSplitter extends Weapon {
    public SkullSplitter() {
        super("Skull Splitter", 8, 4, 20);
    }
    String flavorText = "Skull Splitter." + " +" + minAttackBonus +  " to min attack damage, +" + maxAttackBonus + " to max attack damage, " + crtChanceBonus + " critical strike chance";

    public String toString() {
        return flavorText;
    }
}
