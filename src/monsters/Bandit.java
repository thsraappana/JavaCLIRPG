package monsters;

import items.*;

public class Bandit extends Monster{
    private Object woodenStaff = new WoodenStaff();
    private Object wornArmor = new WornArmor();
    private Object dullDaggers = new DullDaggers();
    private Object shortSword = new ShortSword();
    private Object leatherTunic = new LeatherTunic();
    private Object chainMail = new ChainMail();
    private Object baselard = new Baselard();
    private Object katana = new Katana();
    private Object militaryPick = new MilitaryPick();
    private Object[] commonLoot = {wornArmor, dullDaggers, shortSword, leatherTunic};
    private Object[] uncommonLoot = {baselard, militaryPick};
    private Object[] rareLoot = {katana, chainMail};
    public Bandit() {
        super("Bandit",8, 2, 4, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
