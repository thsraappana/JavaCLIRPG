package monsters;

import items.*;

public class HellHound extends Monster {
    public Object battleAxe = new BattleAxe();
    public Object cuirass = new Cuirass();
    public Object ringMail = new RingMail();
    public Object zweihander = new Zweihander();
    public Object shadowMantle = new ShadowMantle();
    public Object demonhide = new Demonhide();
    private Object[] commonLoot = {battleAxe, cuirass, ringMail};
    private Object[] uncommonLoot = {zweihander, shadowMantle};
    private Object[] rareLoot = {demonhide};
    public HellHound() {
        super("Hell Hound", 28, 8, 16, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
