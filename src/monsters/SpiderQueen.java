package monsters;

import items.Spineripper;

public class SpiderQueen extends Monster {
    private Object spineripper = new Spineripper();
    private Object[] commonLoot = {spineripper};
    private Object[] uncommonLoot = {spineripper};
    private Object[] rareLoot = {spineripper};
    public SpiderQueen() {
        super("Shraroh, the Spider Queen", 45, 20, 35, 4, 10);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
