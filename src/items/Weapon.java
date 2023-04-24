package items;

public class Weapon {
    public enum SpecialAbilities {
        NONE,
        ABILITY_RESET_CHANCE,
        HEAL,
        SELF_DAMAGE,
        DAMAGE_MULTIPLIER,
        EVASION,
        STUN_CHANCE,
    }
    public String name;
    public int maxAttackBonus;
    public int minAttackBonus;
    public int crtChanceBonus;
    public int healthModifier;
    public SpecialAbilities specialAbility;

    public Weapon(String name, int maxAttackBonus, int minAttackBonus, int crtChanceBonus, int healthModifier, SpecialAbilities specialAbility) {
        this.maxAttackBonus = maxAttackBonus;
        this.minAttackBonus = minAttackBonus;
        this.crtChanceBonus = crtChanceBonus;
        this.healthModifier = healthModifier;
        this.specialAbility = specialAbility;
        this.name = name;
    }
    public String toString() {
        return "No weapon equipped";
    }
}
