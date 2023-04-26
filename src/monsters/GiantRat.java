package monsters;

import items.DullDaggers;
import items.RatTailWhip;
import items.WoodenStaff;
import items.WornArmor;

public class GiantRat extends Monster {
    private Object ratTailWhip = new RatTailWhip();
    private Object[] commonLoot = {ratTailWhip};
    private Object[] uncommonLoot = {ratTailWhip};
    private Object[] rareLoot = {ratTailWhip};

    public GiantRat() {
        super("Giant Rat",10, 2, 5, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
