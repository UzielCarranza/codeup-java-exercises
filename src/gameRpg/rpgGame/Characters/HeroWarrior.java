package gameRpg.rpgGame.Characters;

public class HeroWarrior extends Hero {


    public HeroWarrior(){

    }
    public HeroWarrior(int hp, int attack, int defense, String name){
        super(100,10,5, name);
    };



    @Override
    public void selectionSound(){
        System.out.println("Warrior Selected!");
        System.out.println("for honor we fight!");
    }

}
