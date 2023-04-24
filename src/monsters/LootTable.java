package monsters;

import utils.RollUtils;

import java.util.Random;

public class LootTable {
    Object[] commonItems;
    Object[] uncommonItems;
    Object[] rareItems;
    public LootTable(Object[] common, Object[] uncommon, Object[] rare) {
        this.commonItems = common;
        this.uncommonItems = uncommon;
        this.rareItems = rare;
    }

    public Object randomLoot() {
        int rollResult = RollUtils.RollChance();
        Object[] chosenLootTable;
        if (rollResult >= 90) {
            chosenLootTable = rareItems;
        } else if (rollResult >= 60) {
            chosenLootTable = uncommonItems;
        } else {
            chosenLootTable = commonItems;
        }
        int index = new Random().nextInt(chosenLootTable.length);
        return chosenLootTable[index];
    }
}
