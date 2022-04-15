package gameRpg.rpgGame.Characters;

public class HeroWarrior extends Hero {


    public HeroWarrior() {

    }

    public HeroWarrior(int hp, int power, int defense, String name) {
        super(hp, defense, power, name);
    }



    @Override
    public int getHp() {
        return super.getHp();
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
