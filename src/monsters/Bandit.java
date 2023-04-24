package monsters;

import items.WoodenStaff;
import items.WornArmor;
import player.PlayerCharacter;

public class Bandit extends Monster{
    private Object WoodenStaff = new WoodenStaff();
    private Object WornArmor = new WornArmor();
    private Object[] commonLoot = {WoodenStaff, WornArmor};
    private Object[] uncommonLoot = {WoodenStaff};
    private Object[] rareLoot = {WoodenStaff};
    public Bandit() {
        super("Bandit",6, 2, 2, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
