package movies;

import java.util.Arrays;

import util.Input;

public class MoviesSort {
    public MoviesSort() {
    }

    private Movie[] allMovies() {
        Movie[] copyFrom = MoviesArray.findAll();
        Movie[] copyTo = Arrays.copyOf(copyFrom, 100);
        return copyTo;
    }

    public void sortMovies() {
        Input input = new Input();
        int userSelection = input.getInt();
        if (userSelection == 1) {
            viewAllMovies();
        } else if (userSelection == 2) {
            getAllMoviesAnimated();
        } else if (userSelection == 3) {
            getAllMoviesDrama();
        } else if (userSelection == 4) {
            getAllMoviesHorror();

        } else if (userSelection == 5) {
            getAllMoviesSciFi();
        }
    }

    void viewAllMovies() {
        for (Movie movieAll : allMovies()) {
            System.out.println(movieAll.getCategory().concat(" - " + movieAll.getName()) + "\n");

        }
    }

    void getAllMoviesAnimated() {
        for (Movie movie : allMovies()) {
            if (movie.getCategory().compareTo("drama") == -3) {
                System.out.println(movie.getCategory().concat(" - " + movie.getName()) + "\n");
            }
        }
    }

    void getAllMoviesDrama() {
        for (Movie movie : allMovies()) {
            if (movie.getCategory().compareTo("drama") == 0) {
                System.out.println(movie.getCategory().concat(" - " + movie.getName()) + "\n");
            }
        }
    }

    void getAllMoviesHorror(){
        for (Movie movie : allMovies()) {
            if (movie.getCategory().compareTo("drama") == 4) {
                System.out.println(movie.getCategory().concat(" - " + movie.getName()) + "\n");
            }
        }
    }
    void getAllMoviesSciFi(){
        for (Movie movie : allMovies()) {
            if (movie.getCategory().compareTo("drama") == 15) {
                System.out.println(movie.getCategory().concat(" - " + movie.getName()) + "\n");
            }
        }
    }

}


//  musical = 9
//  horror =  4
// comedy -1

//.. scifi = 15


//animated -3
//
//    public void getMoviesDrama() {
//        Movie[] copyFrom = MoviesArray.findAll();
//        Movie[] copyTo = Arrays.copyOf(copyFrom, 100);
//
//        for (Movie movie : copyTo) {
//            System.out.print(movie.getCategory().concat("-" + movie.getName()) + "\n");
//            if (movie.getCategory().compareTo("drama") == 0) {
//                System.out.println(movie.getCategory().concat("-" + movie.getName()) + "\n");
//            }
//        }
//    }
//
//}