import utils.RollUtils;
import java.util.HashMap;
import java.util.Map;

public class ClassAbilities {
    public static Map<String, Integer> MightyBlow(int damageValue, int level) {
        Map<String, Integer> mightyBlow = new HashMap<>();
        mightyBlow.put("damage", damageValue + level);

        int rollResult = RollUtils.RollChance();
        int stunChance = level * 25;
        boolean stunSuccess = stunChance >= rollResult;

        if (stunSuccess) {
            mightyBlow.put("stun", 1);
        } else {
            mightyBlow.put("stun", 0);
        }

        return mightyBlow;
    }
}
