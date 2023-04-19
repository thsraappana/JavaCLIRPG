import java.util.Scanner;

public class CharacterCreation {
    public static PlayerCharacter characterCreation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your characters name: ");
        String charName = scanner.nextLine();

        System.out.print("Please enter the sex of your character (male/female) ");
        String charSex = scanner.nextLine();
        // TODO: add validation to user input

        String cClass = classSelection(scanner);

        // TODO: create the player character and return it to main
        return new PlayerCharacter(charName, charSex, cClass);
    }

    public static void classInfo() {
        System.out.println("Warrior:");
        System.out.println("    Active ability Mighty Blow. Deals extra damage equal to character level and has a chance to stun enemies.");
        System.out.println("    Passive ability: Warriors Will. If dealt lethal damage, has a chance to stay at 1 health instead of dying.");
        System.out.println("Rogue:");
        System.out.println("    Active ability: Evasive Maneuvers. Deal 1.25x damage and enemy next 2 attacks have a 50% chance to miss.");
        System.out.println("    Passive ability: Back stab. First attack of each encounter deals 1.25x damage.");
        System.out.println("Mage:");
        System.out.println("    Active ability: Magic Missile. Deal 1.5x damage.");
        System.out.println("    Passive ability: Higher Mind. Each turn has a chance to reset the use of Magic Missile.");
    }

    public static String classSelection(Scanner scanner) {
        System.out.println("Choose a class for your character; Warrior, Rogue or Mage (if you want more information about the classes, type help instead)");

        String charClass = scanner.nextLine();
        if (charClass.equals("help")) {
            classInfo();
            charClass = classSelection(scanner);
        } else {
            boolean classIsValid = false;
            for (String pClass : PlayerClass.playerClasses) {
                if (pClass.equals(charClass)) {
                    classIsValid = true;
                    break;
                }
            }
            if (!classIsValid) {
                System.out.println("Invalid class name. Choose either Warrior, Rogue or Mage");
                charClass = classSelection(scanner);
            }
        }
        return charClass;
    }
}
