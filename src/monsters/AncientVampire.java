package monsters;

import items.*;

public class AncientVampire extends Monster{
    private Object boneKnife = new BoneKnife();
    private Object cuirass = new Cuirass();
    private Object battleAxe = new BattleAxe();
    private Object shadowMantle = new ShadowMantle();
    private Object ghostSpear = new GhostSpear();
    private Object ghostArmor = new GhostArmor();
    private Object ancientArmor = new AncientArmor();
    private Object fleshRender = new FleshRender();
    private Object[] commonLoot = {boneKnife, cuirass, battleAxe};
    private Object[] uncommonLoot = {shadowMantle, ghostSpear, ghostArmor};
    private Object[] rareLoot = {ancientArmor, fleshRender};
    public AncientVampire() {
        super("Ancient Vampire", 30, 18, 24, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
