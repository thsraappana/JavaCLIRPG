package monsters;

import items.BattleAxe;
import items.Cleaver;
import items.WoodCuttingAxe;
import items.Zweihander;

public class CaveTroll extends Monster {
    private Object battleAxe = new BattleAxe();
    private Object woodCuttingAxe = new WoodCuttingAxe();
    private Object zweihander = new Zweihander();
    private Object cleaver = new Cleaver();
    private Object[] commonLoot = {battleAxe, woodCuttingAxe};
    private Object[] uncommonLoot = {zweihander};
    private Object[] rareLoot = {cleaver};
    public CaveTroll() {
        super("Cave Troll", 24, 2, 8, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}