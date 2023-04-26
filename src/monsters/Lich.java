package monsters;

import items.*;

public class Lich extends Monster {
    public Object shadowMantle = new ShadowMantle();
    public Object ghostSpear = new GhostSpear();
    public Object ghostArmor = new GhostArmor();
    public Object skullSplitter = new SkullSplitter();
    public Object heartCarver = new HeartCarver();
    private Object[] commonLoot = {shadowMantle, ghostSpear, ghostArmor};
    private Object[] uncommonLoot = {skullSplitter};
    private Object[] rareLoot = {heartCarver};
    public Lich() {
        super("Lich", 28, 2, 36, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
