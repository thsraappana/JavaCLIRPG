package gameFLow;

import monsters.Bandit;
import monsters.Brute;
import monsters.Monster;
import monsters.Skeleton;
import player.PassiveEffect;
import player.PlayerCharacter;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
    PlayerCharacter playerCharacter;
    Monster encounterMonster;

    public Encounter(PlayerCharacter character) {
        playerCharacter = character;
    }

    public void encounterFlow() {
        Scanner scanner = new Scanner(System.in);

        startEncounter();

        while(true) {
            encounterBattle(scanner);
            if (encounterMonster.health < 1 || playerCharacter.health < 1) {
                encounterEnd(scanner);
                break;
            }
        }
    }

    public void startEncounter() {
        playerCharacter.isClassAbilityUsed = false;
        System.out.println("\nDelving deeper into the dungeons...\n");
        System.out.println("######################");
        System.out.println("A new monster encountered!");
        System.out.println("######################");

        selectMonster();

        System.out.println("\nYou will now face the next enemy: " + encounterMonster);
    }

    public void encounterEnd(Scanner scanner) {
        playerCharacter.gainExp(encounterMonster.expYielded);
        encounterMonster.dropLoot(playerCharacter, scanner);
        restOrContinue(scanner);
        cleanup();
    }

    public void restOrContinue(Scanner scanner) {
        System.out.println("\n### Show character stats (info) ###");
        System.out.println("You can either rest and recover some health or continue forward and gain experience instead (rest / continue): ");
        String playerChoice = scanner.nextLine();

        if (playerChoice.equals("info")) {
            characterInfo();
            restOrContinue(scanner);
        } else if (playerChoice.equals("rest")) {
            System.out.println("Recovered some health after a good rest. Time to continue deeper into the dungeons.");
            playerCharacter.health += (1 + playerCharacter.playerLevel);
        } else if (playerChoice.equals("continue")) {
            System.out.println("You feel courageous and continue delving deeper into the dungeons without rest.");
            playerCharacter.gainExp(1);
        }
    }

    public void selectMonster() {
        Monster skeleton = new Skeleton();
        Monster bandit = new Bandit();
        Monster brute = new Brute();

        Monster[] level0MonsterTable = {skeleton, bandit};
        Monster[] level1MonsterTable = {skeleton, bandit, brute};
        Monster[] level2MonsterTable = {brute};
        Monster[] level3MonsterTable = {brute};
        Monster[] level4MonsterTable = {brute};

        switch(playerCharacter.playerLevel) {
            case 0:
                int i0 = new Random().nextInt(level0MonsterTable.length);
                this.encounterMonster = level0MonsterTable[i0];
                break;
            case 1:
                int i1 = new Random().nextInt(level1MonsterTable.length);
                this.encounterMonster = level1MonsterTable[i1];
                break;
            case 2:
                int i2 = new Random().nextInt(level2MonsterTable.length);
                this.encounterMonster = level2MonsterTable[i2];
                break;
            case 3:
                int i3 = new Random().nextInt(level3MonsterTable.length);
                this.encounterMonster = level3MonsterTable[i3];
                break;
            case 4:
                int i4 = new Random().nextInt(level4MonsterTable.length);
                this.encounterMonster = level4MonsterTable[i4];
                break;
        }
    }

    public void encounterBattle(Scanner scanner) {
        if (playerCharacter.passiveEffects.length > 0) {
            for (PassiveEffect effect : playerCharacter.passiveEffects) {
                if (effect.effectDuration > 0) {
                    effect.doPassiveEffect();
                    effect.decrementDuration();
                }
                // TODO: cleanup passives with no duration

            }
        }

        playerAttack(scanner);
        if (encounterMonster.health > 0) {
            monsterAttack();
        }
    }

    public void monsterAttack() {
        if (encounterMonster.stunned) {
            System.out.println("\n" + encounterMonster.name + " is stunned and can't attack this turn!");
            encounterMonster.stunned = false;
        } else {
            encounterMonster.attack(playerCharacter);
        }
    }

    public void playerAttack(Scanner scanner) {
        if (playerCharacter.isClassAbilityUsed) {
            System.out.println("\n### No class ability available ###");
        } else {
            System.out.println("\n### Class ability is available to use ###");
        }
        System.out.println("### Show character stats (info) ###");

        System.out.println("Attacking " + encounterMonster.name + ": " + "Choose basic attack (attack) or class special attack (special):");
        String attackType = scanner.nextLine();

        if (attackType.equals("info")) {
            characterInfo();
            playerAttack(scanner);
        } else if(attackType.equals("attack")) {
            playerCharacter.basicAttack(encounterMonster);
        } else if(attackType.equals("special")) {
            playerCharacter.specialAbility(encounterMonster);
        }
        if (attackType.equals("attack") || attackType.equals("special")) {
            if (encounterMonster.health <= 0) {
                System.out.println(encounterMonster.name + " has died!");
            } else {
                System.out.println(encounterMonster.name + " has " + encounterMonster.health + " health left.");
            }
        }
    }

    public void cleanup() {
        playerCharacter.passiveEffects = new PassiveEffect[]{};
    }

    public void characterInfo() {
        System.out.println("---------------");
        System.out.println("Character info:");
        System.out.println("Level: " + playerCharacter.playerLevel);
        System.out.println("Health: " + playerCharacter.health + "/" + playerCharacter.maxHealth);
        System.out.println("Equipped weapon: " + playerCharacter.getEquippedWeapon());
        System.out.println("Equipped armor: " + playerCharacter.getEquippedArmor());
        System.out.println("Attack damage: " + (playerCharacter.minAttackVal + playerCharacter.equippedWeapon.minAttackBonus) + "-" + (playerCharacter.maxAttackVal + playerCharacter.equippedWeapon.maxAttackBonus));
        System.out.println(playerCharacter.getExp());
        System.out.println("---------------");
    }
}
