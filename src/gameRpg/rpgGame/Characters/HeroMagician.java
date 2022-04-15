package gameRpg.rpgGame.Characters;

public class HeroMagician extends Hero {


    public HeroMagician(){

    }
    public HeroMagician(int hp, int attack, int defense, String name){
        super(80,4,6, name);
    };

    @Override
    public void selectionSound(){
        System.out.println("magician Selected!");
        System.out.println("let's play with magic!");
    }

}
