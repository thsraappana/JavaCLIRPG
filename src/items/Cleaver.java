package items;

public class Cleaver extends Weapon{
    public Cleaver() {
        super("Cleaver", 10, 2, 0);
    }
    String flavorText = "Cleaver. +" + minAttackBonus + " to min attack damage, +" + maxAttackBonus + " to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
