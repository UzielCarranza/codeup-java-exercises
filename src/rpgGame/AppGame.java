package rpgGame;

import java.util.Scanner;


public class AppGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select your character");
        String selection = sc.next();
        if (selection.equalsIgnoreCase("warrior")) {
            HeroWarrior heroWarrior = new HeroWarrior();
            heroWarrior.selectionSound();
        } else {
            HeroMagician heroMagician = new HeroMagician();
            heroMagician.selectionSound();
        }
    }

}