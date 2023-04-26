package items;

public class FleshRender extends Weapon {
    public FleshRender() {
        super("Flesh Render", 10, 4, 20);
    }
    String flavorText = "Flesh Render. " + minAttackBonus + " to min attack damage, " + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% to critical strike chance.";

    public String toString() {
        return flavorText;
    }
}
