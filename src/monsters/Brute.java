package monsters;

import player.PlayerCharacter;

public class Brute extends Monster {
    private Object[] commonLoot = {};
    private Object[] uncommonLoot = {};
    private Object[] rareLoot = {};
    public Brute() {
        super("Brute", 20, 3, 7, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
