package monsters;

import items.*;

public class RotFiend extends Monster{
    public Object chainMail = new ChainMail();
    public Object battleAxe = new BattleAxe();
    public Object ironFlail = new IronFlail();
    public Object ringMail = new RingMail();
    public Object boneKnife = new BoneKnife();
    public Object heartCarver = new HeartCarver();
    private Object[] commonLoot = {chainMail, battleAxe, ironFlail};
    private Object[] uncommonLoot = {ringMail, boneKnife};
    private Object[] rareLoot = {heartCarver};
    public RotFiend() {
        super("Rot Fiend", 30, 4, 20, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
