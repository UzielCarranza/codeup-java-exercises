package gameRpg2;

import gameRpg2.Characters.Hero;
import gameRpg2.Characters.HeroMagician;
import gameRpg2.Characters.HeroWarrior;
import gameRpg2.WeaponsApp.Bat;
import gameRpg2.WeaponsApp.Hammer;
import gameRpg2.WeaponsApp.Sword;
import gameRpg2.WeaponsApp.Weapons;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero hero;
        Weapons weapon = null;

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

        if (weaponSelection.equalsIgnoreCase("sword")) {
            weapon = new Sword(3);
        } else if (weaponSelection.equalsIgnoreCase("baseball")) {
            weapon = new Bat(2);
        } else if (weaponSelection.equalsIgnoreCase("hammer")) {
            weapon = new Hammer(4);
        }
        weapon.getWeaponDamage();

        System.out.println("Name your Hero");
        String characterName = sc.next();

        hero.setName(characterName);
        System.out.println("welcome to the game: " + hero.getName());
        System.out.println("------------starting details---------------");

        System.out.printf("HERO NAME: %S \n", hero.getName());
        System.out.println("HP: " + hero.getHp());
        System.out.println("POWER: " + hero.getPower());
        System.out.println("DEFENSE: " + hero.getDefense());
        System.out.println("WEAPON'S POWER: " + weapon.getWeaponDamage());
        System.out.println("------------Loading---------------");
        System.out.println("------------Loading---------------");
        System.out.println("------------loading---------------");
        System.out.println("------------INSTRUCTIONS---------------");
        System.out.println("\n\n---   Select the correct answer!");

        System.out.println("what is 10 + 10?");


    }

}