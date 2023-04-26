package monsters;

import items.*;

public class Faceless extends Monster {
    public Object armingSword = new ArmingSword();
    public Object hardLeatherArmor = new HardLeatherArmor();
    private Object ironFlail = new IronFlail();
    private Object cleaver = new Cleaver();
    private Object shadowMantle = new ShadowMantle();
    private Object heartCarver = new HeartCarver();
    private Object[] commonLoot = {armingSword, hardLeatherArmor, ironFlail};
    private Object[] uncommonLoot = {cleaver, shadowMantle};
    private Object[] rareLoot = {heartCarver};
    public Faceless() {
        super("Faceless", 16, 1, 20, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
