package monsters;

import items.*;

public class LostSoul extends Monster {
    public Object armingSword = new ArmingSword();
    public Object ironFlail = new IronFlail();
    public Object chainMail = new ChainMail();
    public Object ringMail = new RingMail();
    public Object boneKnife = new BoneKnife();
    public Object ghostArmor = new GhostArmor();
    public Object ghostSpear = new GhostSpear();
    private Object[] commonLoot = {armingSword, ironFlail, chainMail};
    private Object[] uncommonLoot = {ringMail, boneKnife};
    private Object[] rareLoot = {ghostArmor, ghostSpear};
    public LostSoul() {
        super("Lost Soul", 22, 4, 6, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
