package items;

public class Weapon {
    public String name;
    public int maxAttackBonus;
    public int minAttackBonus;
    public int crtChanceBonus;

    public Weapon(String name, int maxAttackBonus, int minAttackBonus, int crtChanceBonus) {
        this.maxAttackBonus = maxAttackBonus;
        this.minAttackBonus = minAttackBonus;
        this.crtChanceBonus = crtChanceBonus;
        this.name = name;
    }
    public String toString() {
        return "No weapon equipped. Provides no bonuses.";
    }
}
