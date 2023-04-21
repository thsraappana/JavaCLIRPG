package monsters;

import player.PlayerCharacter;

public class Brute extends Monster {
    public Brute() {
        super("Brute", 10, 3, 6, 1, 2);
    }

    public void attack(PlayerCharacter playerCharacter) {
        System.out.println("\n!!! Brute attacks !!!");
        int basicAttackDamage = basicAttack();
        System.out.println(this.name + " attacks you for " + basicAttackDamage + " damage!\n");
        playerCharacter.takeDamage(basicAttackDamage);
    }
}
