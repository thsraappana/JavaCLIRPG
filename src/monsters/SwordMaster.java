package monsters;

import items.AncientArmor;
import items.FleshRender;
import items.Katana;
import items.Zweihander;

public class SwordMaster extends Monster{
    public Object katana = new Katana();
    public Object zweihander = new Zweihander();
    public Object fleshRender = new FleshRender();
    private Object[] commonLoot = {katana};
    private Object[] uncommonLoot = {zweihander};
    private Object[] rareLoot = {fleshRender};
    public SwordMaster() {
        super("Sword Master", 26, 18, 18, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
