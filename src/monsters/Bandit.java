package monsters;

import player.PlayerCharacter;

public class Bandit extends Monster{

    public Bandit() {
        super("Bandit",6, 2, 2, 0, 1);
    }

    public void attack(PlayerCharacter playerCharacter) {
        System.out.println("\n!!! Bandit attacks !!!\n");
        int basicAttackDamage = basicAttack();
        System.out.println(this.name + " attacks you for " + basicAttackDamage + " damage!");
        playerCharacter.takeDamage(basicAttackDamage);
    }
}
