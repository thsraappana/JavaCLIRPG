package monsters;

import items.CursedAxe;

public class UndeadGiant extends Monster {
    private Object cursedAxe = new CursedAxe();
    private Object[] commonLoot = {cursedAxe};
    private Object[] uncommonLoot = {cursedAxe};
    private Object[] rareLoot = {cursedAxe};
    public UndeadGiant() {
        super("Undead Giant", 70, 10, 20, 4, 10);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
