package rpgGame;

public class HeroWarrior extends Hero {


    public HeroWarrior(){

    }

    public void Attack(){
        System.out.println("Warrior Attacks");
    }

    @Override
    public void selectionSound(){
        System.out.println("Warrior Selected!");
        System.out.println("For honor I fight");
    }

}
