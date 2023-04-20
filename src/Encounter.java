import monsters.Monster;
import utils.MonsterUtils;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
    PlayerCharacter playerCharacter;
    Monster encounterMonster;

    public Encounter(PlayerCharacter character) {
        playerCharacter = character;
    }

    public void encounterFlow() {
        startEncounter();

        while(playerCharacter.getHealth() > 0 || encounterMonster.getHealth() > 0) {
            encounterBattle();
            if (encounterMonster.getHealth() < 1) {
                System.out.println("Monster Defeated!");
                break;
            }
        }
        System.out.println("Lets get some loot and exp!");
    }

    public void startEncounter() {
        System.out.println("######################");
        System.out.println("A new monster encountered!");
        System.out.println("######################");

        selectMonster();

        System.out.print("You will now face the next enemy: ");
        System.out.println(encounterMonster.toString());
    }

    public void selectMonster() {
        encounterMonster = MonsterUtils.getRandomMonster(playerCharacter.getPlayerLevel());
    }

    public void encounterBattle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.print("Attacking " + encounterMonster.getName() + ": ");
        playerAttack(scanner);
    }

    public void playerAttack(Scanner scanner) {
        System.out.println("Choose basic attack (basic) or class special attack (special).");
        if (playerCharacter.isClassAbilityUsed()) {
            System.out.println("### Class ability is already used in this encounter ###");
        } else {
            System.out.println("### Class ability is available to use ###");
        }
        System.out.println("### Show character stats (info) ###");
        String attackType = scanner.nextLine();
        if (attackType.equals("info")) {
            characterInfo();
            playerAttack(scanner);
        } else if(attackType.equals("basic")) {
            Random random = new Random();
            int attackDamage = random.nextInt(playerCharacter.getMaxAttackVal() - playerCharacter.getMinAttackVal() + 1) + playerCharacter.getMinAttackVal();
            System.out.println("You swing at the " + encounterMonster.getName() + " with your " + playerCharacter.getEquippedWeapon() + " dealing " + attackDamage + " damage!");
            encounterMonster.takeDamage(attackDamage);
            if (encounterMonster.getHealth() <= 0) {
                System.out.println(encounterMonster.getName() + " has died!");
            } else {
                System.out.println(encounterMonster.getName() + " has " + encounterMonster.getHealth() + " health left.");
            }
        } else if(attackType.equals("special")) {
            System.out.println("Lets do special attack!");
        }
    }

    public void characterInfo() {
        System.out.println("---------------");
        System.out.println("Character info:");
        System.out.println("Level: " + playerCharacter.getPlayerLevel());
        System.out.println("Health: " + playerCharacter.getHealth() + "/" + playerCharacter.getMaxHealth());
        System.out.println("Equipped weapon: " + playerCharacter.getEquippedWeapon());
        System.out.println("Equipped armor: " + playerCharacter.getEquippedArmor());
        System.out.println("Attack damage: " + playerCharacter.getMinAttackVal() + "-" + playerCharacter.getMaxAttackVal());
        System.out.println("---------------");
    }
}
