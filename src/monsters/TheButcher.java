package monsters;

import items.Cleaver;
import items.HeartCarver;

public class TheButcher extends Monster {
    public Object cleaver = new Cleaver();
    public Object heartCarver = new HeartCarver();
    private Object[] commonLoot = {cleaver};
    private Object[] uncommonLoot = {heartCarver};
    private Object[] rareLoot = {heartCarver};
    public TheButcher() {
        super("The Butcher", 42, 4, 20, 3, 6);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
