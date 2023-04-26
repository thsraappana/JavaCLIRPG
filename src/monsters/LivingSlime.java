package monsters;

import items.*;

public class LivingSlime extends Monster {
    private Object corrodedSword = new CorrodedSword();
    private Object corrodedArmor = new CorrodedArmor();
    private Object[] commonLoot = {corrodedSword, corrodedArmor};
    private Object[] uncommonLoot = {corrodedSword, corrodedArmor};
    private Object[] rareLoot = {corrodedSword, corrodedArmor};

    public LivingSlime() {
        super("Living Slime",16, 0, 3, 0, 1);
        lootTable = new LootTable(commonLoot, uncommonLoot, rareLoot);
    }
}
