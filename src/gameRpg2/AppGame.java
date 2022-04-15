package gameRpg2;

import gameRpg2.Characters.Hero;
import gameRpg2.Characters.HeroMagician;
import gameRpg2.Characters.HeroWarrior;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero hero;

        System.out.println("Please select your character");
        System.out.println("warrior/magician");
        String selection = sc.next();
        if (selection.equalsIgnoreCase("warrior")) {
            hero = new HeroWarrior(100, 3, 5, "");
            hero.selectionSound();
        } else {

            hero = new HeroMagician(80, 5, 3, "");
            hero.selectionSound();
        }

        System.out.println("Select a weapon");
        System.out.println("Sword/baseball/hammer");
        String weaponSelection = sc.next();

//        if (weaponSelection.equalsIgnoreCase("sword")) {
//            weapon.getAttack();
//        } else if (weaponSelection.equalsIgnoreCase("baseball")) {
//            weapon.getAttack();
//        } else if (weaponSelection.equalsIgnoreCase("hammer")) {
//            weapon.getAttack();
//        }

        System.out.println("Name your Hero");
        String characterName = sc.next();
        ;
        hero.setName(characterName);
        System.out.println("welcome to the game: " + hero.getName());
        System.out.println("------------starting details---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("POWER: " + hero.getPower());
        System.out.println("DEFENSE: " + hero.getDefense());
//        System.out.println("WEAPON'S POWER: " + weapon.getAttack());
        System.out.println("------------Loading---------------");
        System.out.println("------------Loading---------------");
        System.out.println("------------loading---------------");
        System.out.println("------------INSTRUCTIONS---------------");

    }

}