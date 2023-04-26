package monsters;

import items.*;

public class Cultist extends Monster{
    private Object woodenStaff = new WoodenStaff();
    private Object wornArmor = new WornArmor();
    private Object dullDaggers = new DullDaggers();
    private Object quiltedArmor = new QuiltedArmor();
    private Object ironFlail = new IronFlail();
    private Object chainMail = new ChainMail();
    private Object boneKnife = new BoneKnife();
    private Object[] commonLoot = {woodenStaff, wornArmor, dullDaggers, quiltedArmor};
    private Object[] uncommonLoot = {ironFlail, chainMail};
    private Object[] rareLoot = {boneKnife};
    public Cultist() {
        super("Cultist", 14, 8, 8, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
