package monsters;

import items.BoneKnife;
import items.Demonhide;
import items.HeartCarver;
import items.ShadowMantle;

public class PactDemon extends Monster{
    public Object boneKnife = new BoneKnife();
    public Object shadowMantle = new ShadowMantle();
    public Object heartCarver = new HeartCarver();
    public Object demonHide = new Demonhide();
    private Object[] commonLoot = {boneKnife, shadowMantle};
    private Object[] uncommonLoot = {demonHide};
    private Object[] rareLoot = {heartCarver};
    public PactDemon() {
        super("Pact Demon", 40, 10, 16, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
