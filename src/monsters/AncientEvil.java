package monsters;

import items.MembraneOfTheOldOne;

public class AncientEvil extends Monster {
    private Object membraneOfTheOldOne = new MembraneOfTheOldOne();
    private Object[] commonLoot = {membraneOfTheOldOne};
    private Object[] uncommonLoot = {membraneOfTheOldOne};
    private Object[] rareLoot = {membraneOfTheOldOne};
    public AncientEvil() {
        super("Utulkod, Ancient Evil", 60, 10, 50, 4, 10);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
