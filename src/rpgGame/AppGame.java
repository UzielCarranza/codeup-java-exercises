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
            characterStructure.setHp(20);
            characterStructure.setPower(2);
        } else {

            characterStructure = new HeroMagician();
            characterStructure.selectionSound();
            characterStructure.setHp(15);
            characterStructure.setPower(3);
        }

        System.out.println("Name your Hero");
        String characterName = sc.next();
        ;
        characterStructure.setName(characterName);
        System.out.println("welcome to the game: " + characterStructure.getName());
        System.out.println("------------starting details---------------");

        System.out.printf("HERO NAME: %S \n", characterStructure.getName());
        System.out.println("HP: " + characterStructure.getHp());
        System.out.println("POWER: " + characterStructure.getPower());
        System.out.println("------------Loading---------------");
        System.out.println("------------Loading---------------");
        System.out.println("------------loading---------------");
        System.out.println("------------INSTRUCTIONS---------------");

    }

}