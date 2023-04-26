package monsters;

import items.*;

public class EldritchHorror extends Monster{
    private Object wornArmor = new WornArmor();
    private Object dullDaggers = new DullDaggers();
    private Object ironFlail = new IronFlail();
    private Object livingArmor = new LivingArmor();
    private Object fleshRender = new FleshRender();
    private Object[] commonLoot = {wornArmor, dullDaggers, ironFlail};
    private Object[] uncommonLoot = {livingArmor};
    private Object[] rareLoot = {fleshRender};
    public EldritchHorror() {
        super("Eldritch Horror", 22, 16, 16, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
