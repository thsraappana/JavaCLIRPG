package utils;

import monsters.Bandit;
import monsters.Brute;
import monsters.Monster;
import monsters.Skeleton;

import java.util.Random;

public class MonsterUtils {
    static Monster skeleton = new Skeleton();
    static Monster bandit = new Bandit();
    static Monster brute = new Brute();
    static Monster[] level0MonsterTable = {skeleton, bandit};
    static Monster[] level1MonsterTable = {skeleton, bandit, brute};

    public static Monster getRandomMonster(int playerLevel) {
        int index;
        switch(playerLevel) {
            case 0:
                index = new Random().nextInt(level0MonsterTable.length);
                return level0MonsterTable[index];
                // code block
            case 1:
                index = new Random().nextInt(level1MonsterTable.length);
                return level0MonsterTable[index];
        }
        return null;
    }
}
