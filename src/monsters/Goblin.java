package monsters;

import items.*;

public class Goblin extends Monster {
    private Object wornArmor = new WornArmor();
    private Object dullDaggers = new DullDaggers();
    private Object woodCuttingAxe = new WoodCuttingAxe();
    private Object shortSword = new ShortSword();
    private Object ironFlail = new IronFlail();
    private Object baselard = new Baselard();
    private Object armingSword = new ArmingSword();
    private Object[] commonLoot = {woodCuttingAxe, wornArmor, dullDaggers, shortSword};
    private Object[] uncommonLoot = {ironFlail, baselard};
    private Object[] rareLoot = {armingSword};
    public Goblin() {
        super("Goblin",8, 3, 6, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
