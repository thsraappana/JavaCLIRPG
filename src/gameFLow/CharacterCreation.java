package gameFLow;

import items.*;
import player.PlayerCharacter;
import player.classes.Mage;
import player.classes.Rogue;
import player.classes.Warrior;

import java.util.Scanner;

public class CharacterCreation {
    static String[] playerJobs = {"Warrior", "Rogue", "Mage"};

    public static PlayerCharacter characterCreation() {
        Scanner scanner = new Scanner(System.in);
        PlayerCharacter playerCharacter = null;

        System.out.print("Please enter your characters name: ");
        String charName = scanner.nextLine();

        String job = jobSelection(scanner);
        switch(job) {
            case "Warrior":
                playerCharacter = new Warrior(charName, job);
                break;
            case "Rogue":
                playerCharacter = new Rogue(charName, job);
                break;
            case "Mage":
                playerCharacter = new Mage(charName, job);
            break;
        }

        equipStartingItem(playerCharacter);

        return playerCharacter;
    }

    public static void classInfo() {
        System.out.println("Warrior:");
        System.out.println("    Active ability Mighty Blow. Deals extra damage equal to character level and has a chance to stun enemies.");
        System.out.println("    Passive ability: Warriors Will. If dealt lethal damage, has a chance to stay at 1 health instead of dying.");
        System.out.println("    Starting item: Worn Armor. Adds 1 shield value. Shield value reduced the damage enemies deal.");
        System.out.println("Rogue:");
        System.out.println("    Active ability: Evasive Maneuvers. Deal 1.25x damage and enemy next 2 attacks have a 50% chance to miss.");
        System.out.println("    Passive ability: Back stab. First attack of each encounter deals 1.25x damage.");
        System.out.println("    Starting Item. Dull daggers. Adds 10% critical strike chance and 1 to min damage.");
        System.out.println("Mage:");
        System.out.println("    Active ability: Magic Missile. Deal 1.5x damage.");
        System.out.println("    Passive ability: Higher Mind. Each turn has a chance to reset the use of Magic Missile.");
        System.out.println("    Starting item. Wooden staff. Adds 3 to max damage.");
    }

    public static void equipStartingItem(PlayerCharacter playerCharacter) {
        switch(playerCharacter.charJob) {
            case "Warrior":
                Armor warriorArmor = new WornArmor();
                playerCharacter.equipArmor(warriorArmor);
                break;
            case "Rogue":
                Weapon rogueWeapon = new DullDaggers();
                playerCharacter.equipWeapon(rogueWeapon);
                break;
            case "Mage":
                Weapon mageWeapon = new WoodenStaff();
                playerCharacter.equipWeapon(mageWeapon);
        }
    }

    public static String jobSelection(Scanner scanner) {
        System.out.println("Choose a job for your character; Warrior, Rogue or Mage (if you want more information about jobs, type help instead)");

        String charJob = scanner.nextLine();
        if (charJob.equals("help")) {
            classInfo();
            charJob = jobSelection(scanner);
        } else {
            boolean jobIsValid = false;
            for (String pClass : playerJobs) {
                if (pClass.equals(charJob)) {
                    jobIsValid = true;
                    break;
                }
            }
            if (!jobIsValid) {
                System.out.println("Invalid job. Choose either Warrior, Rogue or Mage");
                charJob = jobSelection(scanner);
            }
        }
        return charJob;
    }
}
