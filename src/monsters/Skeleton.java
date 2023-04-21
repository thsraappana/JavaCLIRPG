package monsters;

import player.PlayerCharacter;

public class Skeleton extends Monster {
    public Skeleton() {
        super("Skeleton",5, 1, 3, 0, 1);
    }

    public void attack(PlayerCharacter playerCharacter) {
        System.out.println("\n!!! Skeleton attacks !!!\n");
        int basicAttackDamage = basicAttack();
        System.out.println(this.name + " attacks you for " + basicAttackDamage + " damage!\n");
        playerCharacter.takeDamage(basicAttackDamage);
    }
}
