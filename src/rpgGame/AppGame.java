package rpgGame;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterStructure characterStructure;



        System.out.println("Please select your character");
        String selection = sc.next();
        if (selection.equalsIgnoreCase("warrior")) {
            characterStructure = new HeroWarrior();
            characterStructure.selectionSound();
        } else {

            characterStructure = new HeroMagician();
            characterStructure.selectionSound();
        }

        characterStructure.getHp();
        characterStructure.getDefense();
        characterStructure.getPower();

    }

}