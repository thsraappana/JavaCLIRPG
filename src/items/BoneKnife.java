package items;

public class BoneKnife extends Weapon{
    public BoneKnife() {
        super("Bone Knife", 6, 3, 30);
    }
    String flavorText = "Bone Knife. +3 to min attack damage, +6 to max attack damage, 30% increased critical strike chance";

    public String toString() {
        return flavorText;
    }
}
