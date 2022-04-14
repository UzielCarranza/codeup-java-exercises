package rpgGame;

public class HeroWarrior extends CharacterStructure {


    public HeroWarrior(){

    }

    public void Attack(){
        System.out.println("Warrior Attacks");
    }

    @Override
    public void selectionSound(){
        System.out.println("Warrior Selected!");
    }

}
