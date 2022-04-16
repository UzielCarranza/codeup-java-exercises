package gameRpg2;

import gameRpg2.Characters.Hero;
import gameRpg2.Characters.HeroMagician;
import gameRpg2.Characters.HeroWarrior;
import gameRpg2.WeaponsApp.Weapons;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random_int = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        Hero hero;
        Weapons weapon = null;


        System.out.println("Please select your character");
        System.out.println("warrior/magician");
        String selection = sc.next();
        if (selection.equalsIgnoreCase("warrior")) {
            hero = new HeroWarrior(10, 3, 5, "");
            hero.selectionSound();
        } else {

            hero = new HeroMagician(8, 5, 3, "");
            hero.selectionSound();
        }

//        System.out.println("Select a weapon");
//        System.out.println("Sword/baseball/hammer");
//        String weaponSelection = sc.next();
//
//        if (weaponSelection.equalsIgnoreCase("sword")) {
//            weapon = new Sword(3);
//        } else if (weaponSelection.equalsIgnoreCase("baseball")) {
//            weapon = new Bat(2);
//        } else if (weaponSelection.equalsIgnoreCase("hammer")) {
//            weapon = new Hammer(4);
//        }
//        weapon.getWeaponDamage();

        System.out.println("Name your Hero");
        String characterName = sc.next();

        hero.setName(characterName);
        System.out.println("welcome to the game: " + hero.getName());
        System.out.println("------------starting details---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("------------Loading---------------");
        System.out.println("------------Loading---------------");
        System.out.println("------------loading---------------");
        System.out.println("------------INSTRUCTIONS---------------");
        System.out.println("\n\n---   Select the correct answer!");

        System.out.println("\n \n first question");
        boolean Question1 = true;

        do {


            String question = "What is Earth's longest continent?";
            String answerOne = "Europe";
            String answerTwo = "Asia";
            String answerThree = "Antarctica";
            String answerFour = "Africa";

            String correctAnswer = answerTwo;
            System.out.println(question);
            System.out.println(answerOne);
            System.out.println(answerTwo);
            System.out.println(answerThree);
            System.out.println(answerFour);
            String userInput = sc.next();

            if (correctAnswer.equalsIgnoreCase(userInput)) {
                System.out.println("correct");
                Question1 = false;
            } else {
                Question1 = false;
                hero.setReceiveDamage(random_int);
                System.out.println(hero.getName() + " received: " + hero.getReceiveDamage() + " damage");
            }
        } while (Question1);
        hero.setHp(hero.calculateDamage(hero.getHp(), hero.getReceiveDamage()));
        if (hero.getHp() <= 0) {
            System.out.println("game over");
            System.out.close();
        }

        System.out.println("------------next round---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("------------Loading next round ---------------");
        System.out.println("------------Loading next round ---------------");
        System.out.println("------------Loading next round ---------------");
        System.out.println("\n\n---   Select the correct answer!");


        boolean Question2 = true;

        do {


            String question = "In what country can you visit Machi Pichu?";
            String answerOne = "Columbia";
            String answerTwo = "Peru";
            String answerThree = "Chile";
            String answerFour = "Bolivia";

            String correctAnswer = answerTwo;
            System.out.println(question);
            System.out.println(answerOne);
            System.out.println(answerTwo);
            System.out.println(answerThree);
            System.out.println(answerFour);

            String userInput2 = sc.next();

            if (correctAnswer.equalsIgnoreCase(userInput2)) {
                System.out.println("correct");
                Question1 = false;
            } else {
                Question1 = false;
                hero.setReceiveDamage(random_int);
                System.out.println(hero.getName() + " received: " + hero.getReceiveDamage() + " damage");
            }

        } while (Question1);
        if (hero.getHp() <= 0) {
            System.out.println("game over");
            System.out.close();
        }
        hero.setHp(hero.calculateDamage(hero.getHp(), hero.getReceiveDamage()));
        if (hero.getHp() <= 0) {
            System.out.println("game over");
            System.out.close();
        }
        System.out.println("------------next round---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("------------Loading next round ---------------");
        System.out.println("------------Loading next round ---------------");
        System.out.println("------------Loading next round ---------------");
        System.out.println("\n\n---   Select the correct answer!");


        boolean Question3 = true;

        do {


            String question = "What African nation has the most pyramids?";
            String answerOne = "Egypt";
            String answerTwo = "Sudan";
            String answerThree = "Algeria";
            String answerFour = "Libya";

            String correctAnswer = answerTwo;
            System.out.println(question);
            System.out.println(answerOne);
            System.out.println(answerTwo);
            System.out.println(answerThree);
            System.out.println(answerFour);

            String userInput2 = sc.next();

            if (correctAnswer.equalsIgnoreCase(userInput2)) {
                System.out.println("correct");
                Question1 = false;
            } else {
                Question1 = false;
                hero.setReceiveDamage(random_int);
                System.out.println(hero.getName() + " received: " + hero.getReceiveDamage() + " damage");
            }
        } while (Question3);
        hero.setHp(hero.calculateDamage(hero.getHp(), hero.getReceiveDamage()));
        if (hero.getHp() <= 0) {
            System.out.println("game over");
            System.out.close();
        }
        System.out.println(hero.getName() + " : " + hero.getHp() + "hp");
        if (hero.getHp() == 0) {
            System.out.println("game over");
        } else {
            System.out.println("you won!");
        }

    }


}
