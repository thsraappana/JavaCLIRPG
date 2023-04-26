package monsters;

import items.*;

public class Minotaur extends Monster{
    public Object battleAxe = new BattleAxe();
    public Object hardLeatherArmor = new HardLeatherArmor();
    public Object chainMail = new ChainMail();
    public Object warHammer = new WarHammer();
    public Object zweihander = new Zweihander();
    public Object ancientArmor = new AncientArmor();
    public Object heartCarver = new HeartCarver();
    private Object[] commonLoot = {battleAxe, hardLeatherArmor, chainMail};
    private Object[] uncommonLoot = {warHammer, zweihander};
    private Object[] rareLoot = {ancientArmor, heartCarver};
    public Minotaur() {
        super("Minotaur", 26, 8, 14, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
