package items;

public class ShortSword extends Weapon {
        public ShortSword() {
            super("Short Sword", 2, 1, 0);
        }
        String flavorText = "Short Sword. A common weapon. +1 to min attack damage, +2 to max attack damage";

        public String toString() {
            return flavorText;
        }
}
