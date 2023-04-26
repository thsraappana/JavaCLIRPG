package monsters;

import items.DragonScaleArmor;

public class Dragon extends Monster{
    private Object dragonScaleArmor = new DragonScaleArmor();
    private Object[] commonLoot = {dragonScaleArmor};
    private Object[] uncommonLoot = {dragonScaleArmor};
    private Object[] rareLoot = {dragonScaleArmor};
    public Dragon() {
        super("Dragon", 50, 22, 36, 4, 10);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
