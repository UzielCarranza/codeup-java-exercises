package gameRpg.rpgGame.Characters;

public class HeroMagician extends Hero {


    public HeroMagician(){

    }
    public HeroMagician(int hp, int attack, int defense, String name){
        super(hp,attack,defense, name);
    };

    @Override
    public void selectionSound(){
        System.out.println("magician Selected!");
        System.out.println("let's play with magic!");
    }

}
