public class PlayerCharacter {
    String charName;
    String charClass;
    String charSex;
    
    public PlayerCharacter(String name, String sex, String pClass) {
        charName = name;
        charClass = pClass;
        charSex = sex;
    }

    public String toString() {
        return "This characters name is: " + charName + ", Sex is: " + charSex + ", Class is: " + charClass;
    }
}
