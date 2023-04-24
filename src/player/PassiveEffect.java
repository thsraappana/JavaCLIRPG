package player;

public class PassiveEffect {
    public String effectName;
    public int effectDuration;
    public PassiveEffect(String name, int duration) {
        this.effectName = name;
        this.effectDuration = duration;
    }
    public void decrementDuration() {
        effectDuration -= 1;
    }
    public void doPassiveEffect() {
        // TODO: functionality to passive effects!
        System.out.println("Lets do the passive effect here! " + effectName);
    }
}
