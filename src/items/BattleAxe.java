package items;

public class BattleAxe extends Weapon{
    public BattleAxe() {
        super("Battle Axe", 6, 0, 0);
    }
    String flavorText = "Battle Axe. This heavy axe can deal some serious damage. +" + maxAttackBonus + " to max attack damage.";

    public String toString() {
        return flavorText;
    }
}
