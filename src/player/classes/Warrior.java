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
        int trueDmg = baseDamage + (playerLevel + 1);

        boolean stunSuccess = stunChance >= rollResult;
        System.out.println("Dealt " + trueDmg + " damage! ");
        if (stunSuccess) {
            System.out.println("### " + encounterMonster.name.toUpperCase() + " IS STUNNED ###");
            encounterMonster.stunned = true;
        }
        encounterMonster.takeDamage(trueDmg);
        isClassAbilityUsed = true;
    }

}
