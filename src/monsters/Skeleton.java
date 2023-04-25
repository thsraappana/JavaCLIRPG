package monsters;

import items.DullDaggers;
import items.WoodenStaff;
import items.WornArmor;

public class Skeleton extends Monster {
    private Object WoodenStaff = new WoodenStaff();
    private Object WornArmor = new WornArmor();
    private Object DullDaggers = new DullDaggers();
    private Object[] commonLoot = {WoodenStaff, WornArmor, DullDaggers};
    private Object[] uncommonLoot = {WoodenStaff};
    private Object[] rareLoot = {WoodenStaff};

    public Skeleton() {
        super("Skeleton",12, 1, 4, 0, 1);

        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
