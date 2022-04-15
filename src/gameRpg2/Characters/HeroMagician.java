package gameRpg2.Characters;

public class HeroMagician extends Hero {


    public HeroMagician(){

    }

    public HeroMagician(int hp, int power, int defense, String name) {
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
    public void selectionSound(){
        System.out.println("magician Selected!");
        System.out.println("let's play with magic!");
    }

}
