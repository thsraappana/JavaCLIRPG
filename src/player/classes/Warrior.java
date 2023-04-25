package player.classes;

import monsters.Monster;
import player.PlayerCharacter;
import utils.RollUtils;

public class Warrior extends PlayerCharacter {
    public Warrior(String name, String job) {
        super(name, job);
    }

    public void specialAbility(Monster encounterMonster) {
        System.out.println("Using Mighty Blow on " + encounterMonster.name + "! ");

        int rollResult = RollUtils.RollChance();
        int stunChance = playerLevel * 25;
        int baseDamage = getBaseDmg();
        int modifiedDamage = baseDamage + (playerLevel + 1);
        int finalDamage = crtDamage(modifiedDamage);
        boolean stunSuccess = stunChance >= rollResult;
        if (stunSuccess) {
            System.out.println("### " + encounterMonster.name.toUpperCase() + " IS STUNNED ###");
            encounterMonster.stunned = true;
        }
        encounterMonster.takeDamage(finalDamage);
        System.out.println("Dealt " + finalDamage + " damage! ");

        isClassAbilityUsed = true;
    }

    public void playerDeath() {
        int rollResult = RollUtils.RollChance();
        if (rollResult >= 80) {
            System.out.println("Your Warriors Will keeps you at 1 health instead of dying!");
            health = 1;
        } else {
            System.out.println("You have died!");
            System.exit(0);
        }
    }
}
