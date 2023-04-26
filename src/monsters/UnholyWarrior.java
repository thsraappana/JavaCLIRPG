package monsters;

import items.BattleAxe;
import items.Katana;
import items.PlateArmor;
import items.SkullSplitter;

public class UnholyWarrior extends Monster{
    public Object battleAxe = new BattleAxe();
    public Object katana = new Katana();
    public Object plateArmor = new PlateArmor();
    public Object skullSplitter = new SkullSplitter();
    private Object[] commonLoot = {battleAxe, katana};
    private Object[] uncommonLoot = {plateArmor};
    private Object[] rareLoot = {skullSplitter};
    public UnholyWarrior() {
        super("Unholy Warrior", 24, 10, 18, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
