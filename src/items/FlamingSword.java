package items;

public class FlamingSword extends Weapon {
    public FlamingSword() {
        super("Flaming Sword", 20, 14, 15);
    }
    String flavorText = "Flaming Sword. A sword used by the archdemons. +" + minAttackBonus + " to min attack damage, +" + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
