package items;

public class ShadowMantle extends Armor {
    public ShadowMantle() {
        super("Shadow Mantle",0, 40);
    }
    String flavorText = "Shadow Mantle. 40% evasion chance.";
    public String toString() {
        return flavorText;
    }
}
