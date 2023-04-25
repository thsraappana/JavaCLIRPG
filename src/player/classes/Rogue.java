package player.classes;

import monsters.Monster;
import player.PassiveEffect;
import player.PlayerCharacter;

import java.sql.Array;
import java.util.Arrays;

public class Rogue extends PlayerCharacter {
    public Rogue(String name, String job) {
        super(name, job);
    }
    public void specialAbility(Monster encounterMonster) {
        System.out.println("Using Evasive Maneuvers on " + encounterMonster.name + "! ");
        int baseDamage = getBaseDmg();
        int modifiedDamage = baseDamage + (baseDamage / 2);
        int finalDamage = crtDamage(modifiedDamage);
        encounterMonster.takeDamage(finalDamage);
        System.out.println("Dealt " + finalDamage + " damage! ");

        PassiveEffect evasiveManeuvers = new PassiveEffect("Evasive Maneuvers", 2, this);
        PassiveEffect[] newArray = Arrays.copyOf(passiveEffects, passiveEffects.length + 1);
        newArray[newArray.length - 1] = evasiveManeuvers;
        passiveEffects = newArray;

        isClassAbilityUsed = true;
    }
}
