package monsters;

import items.FlamingSword;

public class Archdemon extends Monster {
    private Object flamingSword = new FlamingSword();
    private Object[] commonLoot = {flamingSword};
    private Object[] uncommonLoot = {flamingSword};
    private Object[] rareLoot = {flamingSword};
    public Archdemon() {
        super("Archdemon", 42, 16, 30, 4, 10);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
