package items;

public class CursedAxe extends Weapon {
    public CursedAxe() {
        super("Cursed Axe", 30, 8, 15);
    }
    String flavorText = "Cursed Axe. Axe used by the undead giants. +" + minAttackBonus + " to min attack damage, +" + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
