package monsters;

import items.BattleAxe;
import items.ChainMail;
import items.IronFlail;
import items.RingMail;
import player.PlayerCharacter;

public class Brute extends Monster {
    private Object battleAxe = new BattleAxe();
    private Object ironFlail = new IronFlail();
    private Object ringMail = new RingMail();
    private Object chainMail = new ChainMail();
    private Object[] commonLoot = {battleAxe, ironFlail};
    private Object[] uncommonLoot = {chainMail};
    private Object[] rareLoot = {ringMail};
    public Brute() {
        super("Brute", 20, 4, 8, 1, 2);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
