package movies;

import util.Input;

import java.util.Arrays;
import java.util.Locale;


public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        do {


            System.out.println("what would you like to do?\n");

            System.out.println("0 - exit");

            System.out.println("1 - view all movies");

            System.out.println("2 - view movies in the animated category");

            System.out.println("3 - view movies in the drama category");


            System.out.println("4 - view movies in the horror category");


            System.out.println("5 - view movies in the scifi-category");

            System.out.println("enter your choice");
            MoviesSort moviesSort = new MoviesSort();
            moviesSort.sortMovies();
            System.out.println("Would you like to continue with the app?");
        } while (input.yesNo());
    }
}
