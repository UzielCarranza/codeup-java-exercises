package rpgGame;

public class CharacterStructure {
//    fields

    private int hp;
    private int power;
    private int defense;


//    constructor
    public CharacterStructure(){

    }
    public CharacterStructure(int hp, int defense, int power){
        this.hp = hp;
        this.power = power;
        this.defense = defense;


    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
