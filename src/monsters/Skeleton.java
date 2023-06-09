package monsters;

import items.*;

public class Skeleton extends Monster {
    private Object woodenStaff = new WoodenStaff();
    private Object wornArmor = new WornArmor();
    private Object dullDaggers = new DullDaggers();
    private Object shortSword = new ShortSword();
    private Object ironFlail = new IronFlail();
    private Object armingSword = new ArmingSword();
    private Object chainMail = new ChainMail();
    private Object boneKnife = new BoneKnife();
    private Object[] commonLoot = {woodenStaff, wornArmor, shortSword};
    private Object[] uncommonLoot = {ironFlail};
    private Object[] rareLoot = {armingSword, chainMail, boneKnife};

    public Skeleton() {
        super("Skeleton",10, 1, 3, 0, 1);

        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
