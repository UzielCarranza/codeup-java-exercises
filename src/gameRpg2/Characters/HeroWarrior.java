package gameRpg2.Characters;

public class HeroWarrior extends Hero {

    int total;

    public HeroWarrior() {

    }

    public HeroWarrior(int hp, int power, int defense, String name) {
        super(hp, defense, power, name);
    }



    public int getHp() {
        return super.getHp();
    }


    public int setHp(int hp, int damage) {
        return this.total = hp - damage;

    }

    @Override
    public int getDefense() {
        return super.getDefense();
    }

    @Override
    public int getPower() {
        return super.getPower();
    }

    @Override
    public void selectionSound() {
        System.out.println("Warrior Selected!");
        System.out.println("for honor we fight!");
    }

}
