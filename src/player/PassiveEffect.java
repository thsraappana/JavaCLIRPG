package player;

public class PassiveEffect {
    public String effectName;
    public int effectDuration;
    public int initialDuration;
    PlayerCharacter playerCharacter;

    public PassiveEffect(String name, int duration, PlayerCharacter player) {
        this.effectName = name;
        this.effectDuration = duration;
        this.initialDuration = duration;
        this.playerCharacter = player;
    }
    public void decrementDuration() {
        effectDuration -= 1;
    }
    public void doPassiveEffect() {
        switch(effectName) {
            case "Evasive Maneuvers":
                if (initialDuration == effectDuration) {
                    playerCharacter.evasion += 50;
                }
                break;
        }
    }
    public void passiveCleanUp() {
        switch(effectName) {
            case "Evasive Maneuvers":
                playerCharacter.evasion -= 50;
                break;
        }
    }
}
