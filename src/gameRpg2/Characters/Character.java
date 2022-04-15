package gameRpg2.Characters;

public class Character {
    private int hp;
    private int power;
    private int defense;
    private String name;


    //    constructor
    public Character(){

    }
    public Character(int hp, int defense, int power, String name){
        this.hp = hp;
        this.power = power;
        this.defense = defense;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectionSound(){
        System.out.println(this.name + "selected!");
    }
}
