package items;

public class Spineripper extends Weapon{
    public Spineripper() {
        super("Spineripper", 16, 14, 80);
    }
    String flavorText = "Spineripper. Dagger used by the spider queen. +" + minAttackBonus + " to min attack damage, +" + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
