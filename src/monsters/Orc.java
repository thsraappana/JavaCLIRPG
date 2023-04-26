package monsters;

import items.*;

public class Orc extends Monster{
    public Object armingSword = new ArmingSword();
    public Object battleAxe = new BattleAxe();
    public Object hardLeatherArmor = new HardLeatherArmor();
    public Object cleaver = new Cleaver();
    public Object plateArmor = new PlateArmor();
    public Object skullSplitter = new SkullSplitter();
    private Object[] commonLoot = {armingSword, battleAxe, hardLeatherArmor};
    private Object[] uncommonLoot = {cleaver, plateArmor};
    private Object[] rareLoot = {skullSplitter};
    public Orc() {
        super("Orc", 18, 4, 6, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
