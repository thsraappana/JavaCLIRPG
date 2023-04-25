package player.classes;

import monsters.Monster;
import player.PlayerCharacter;
import utils.RollUtils;

public class Mage extends PlayerCharacter {
    public Mage(String name, String job) {
        super(name, job);
    }
    public void specialAbility(Monster encounterMonster) {
        System.out.println("Using Magic Missile on " + encounterMonster.name + "! ");

        int baseDamage = getBaseDmg();
        int modifiedDamage = baseDamage * 2;
        int finalDamage = crtDamage(modifiedDamage);

        encounterMonster.takeDamage(finalDamage);
        System.out.println("Dealt " + finalDamage + " damage! ");

        isClassAbilityUsed = true;
    }

    public void HigherMind(boolean isFirstTurn) {
        if (!isFirstTurn) {
            int rollHigherMind = RollUtils.RollChance();
            if (rollHigherMind > 75) {
                System.out.println("\nYour higher mind awakens, allowing you to use Magic Missiles again!");
                isClassAbilityUsed = false;
            }
        }

    }
}
