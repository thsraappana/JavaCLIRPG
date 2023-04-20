import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void greetPlayer() {
        System.out.println("Welcome to the Java CLI RPG");
        System.out.println("In this game you will fight monsters, gain experience and loot items.");
        System.out.println("You will win the game by reaching level 5. But beware, there are many monsters to face, and dying means losing the game!");
        System.out.println("Lets start by creating a character!");
    }
    public static void main(String[] args) {
        greetPlayer();
        PlayerCharacter character = CharacterCreation.characterCreation();

        System.out.println("Entering the dungeon...");

        Encounter encounter = new Encounter(character);
        encounter.encounterFlow();
    }
}