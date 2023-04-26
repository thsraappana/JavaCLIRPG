package items;

public class Baselard extends Weapon{
    public Baselard() {
        super("Baselard", 2, 1, 20);
    }
    String flavorText = "Baselard. A long cutting dagger. +" + minAttackBonus + " to min attack damage, +" + maxAttackBonus + " to max attack damage, " + crtChanceBonus + "% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
