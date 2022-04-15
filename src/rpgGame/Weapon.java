package rpgGame;

public class Weapon {
    private int attackPower;

    public Weapon(){

    }
    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttack() {
        return attackPower;
    }

    public void setAttack(int attackPower) {
        this.attackPower = attackPower;
    }
}

