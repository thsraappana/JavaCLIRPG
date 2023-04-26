package monsters;

import items.*;

public class ShamblingCorpse extends Monster{
    private Object woodenStaff = new WoodenStaff();
    private Object wornArmor = new WornArmor();
    private Object battleAxe = new BattleAxe();
    private Object woodCuttingAxe = new WoodCuttingAxe();
    private Object leatherTunic = new LeatherTunic();
    private Object chainMail = new ChainMail();
    private Object armingSword = new ArmingSword();
    private Object[] commonLoot = {woodenStaff, wornArmor, woodCuttingAxe, leatherTunic};
    private Object[] uncommonLoot = {chainMail};
    private Object[] rareLoot = {battleAxe, armingSword};

    public ShamblingCorpse() {
        super("Shambling Corpse",7, 1, 10, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
