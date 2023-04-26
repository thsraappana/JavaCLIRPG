package monsters;

import items.BoneKnife;
import items.ChainMail;
import items.Katana;
import items.LivingArmor;

public class TwistedAbomination extends Monster {
    public Object chainMail = new ChainMail();
    public Object katana = new Katana();
    public Object boneKnife = new BoneKnife();
    public Object livingArmor = new LivingArmor();

    private Object[] commonLoot = {chainMail, katana};
    private Object[] uncommonLoot = {boneKnife};
    private Object[] rareLoot = {livingArmor};
    public TwistedAbomination() {
        super("Twisted Abomination", 20, 8, 26, 2, 4);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
