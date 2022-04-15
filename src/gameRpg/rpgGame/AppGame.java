package gameRpg.rpgGame;

import gameRpg.rpgGame.Characters.Hero;
import gameRpg.rpgGame.Characters.HeroMagician;
import gameRpg.rpgGame.Characters.HeroWarrior;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero hero;
        Weapon weapon = new Weapon();


        System.out.println("Please select your character");
        System.out.println("warrior/magician");
        String selection = sc.next();
        if (selection.equalsIgnoreCase("warrior")) {
            hero = new HeroWarrior();
            hero.selectionSound();
            hero.setHp(20);
            hero.setPower(2);
        } else {

            hero = new HeroMagician();
            hero.selectionSound();
            hero.setHp(25);
            hero.setPower(1);
        }

        System.out.println("Select a weapon");
        System.out.println("Sword/baseball/hammer");
        String weaponSelection = sc.next();

        if (weaponSelection.equalsIgnoreCase("sword")) {
            weapon.setAttack(3);
        } else if (weaponSelection.equalsIgnoreCase("baseball")) {
            weapon.setAttack(5);
        } else if (weaponSelection.equalsIgnoreCase("hammer")) {
            weapon.setAttack(4);
        }

        System.out.println("Name your Hero");
        String characterName = sc.next();
        ;
        hero.setName(characterName);
        System.out.println("welcome to the game: " + hero.getName());
        System.out.println("------------starting details---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("POWER: " + hero.getPower());
        System.out.println("WEAPON'S POWER: " + weapon.getAttack());
        System.out.println("------------Loading---------------");
        System.out.println("------------Loading---------------");
        System.out.println("------------loading---------------");
        System.out.println("------------INSTRUCTIONS---------------");

    }

}