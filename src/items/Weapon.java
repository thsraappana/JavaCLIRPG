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
    String name;
    int maxAttackBonus;
    int minAttackBonus;
    int crtChanceBonus;
    int healthModifier;
    SpecialAbilities specialAbility;

    public Weapon(String name, int maxAttackBonus, int minAttackBonus, int crtChanceBonus, int healthModifier, SpecialAbilities specialAbility) {
        this.maxAttackBonus = maxAttackBonus;
        this.minAttackBonus = minAttackBonus;
        this.crtChanceBonus = crtChanceBonus;
        this.healthModifier = healthModifier;
        this.specialAbility = specialAbility;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMinAttackBonus() {
        return minAttackBonus;
    }

    public int getMaxAttackBonus() {
        return maxAttackBonus;
    }

    public String toString() {
        return "No weapon equipped";
    }
}
