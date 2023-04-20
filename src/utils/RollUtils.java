package utils;

import java.util.Random;

public class RollUtils {
    public static int RollChance() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        return randomNum;
    }
}
