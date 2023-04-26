package monsters;

import items.*;

public class DeathKnight extends Monster{
    public Object zweihander = new Zweihander();
    public Object warHammer = new WarHammer();
    public Object cuirass = new Cuirass();
    public Object plateArmor = new PlateArmor();
    public Object skullSplitter = new SkullSplitter();
    public Object ancientArmor = new AncientArmor();
    private Object[] commonLoot = {zweihander, warHammer, cuirass};
    private Object[] uncommonLoot = {plateArmor, skullSplitter};
    private Object[] rareLoot = {ancientArmor};
    public DeathKnight() {
        super("Death Knight", 36, 12, 20, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
