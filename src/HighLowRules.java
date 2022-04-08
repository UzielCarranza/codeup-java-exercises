import java.util.Random;
import java.util.Scanner;

public class HighLowRules {
    Random rand = new Random(); //instance of random class
    Scanner input = new Scanner(System.in);
    int guessNumber;

    public HighLowRules(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int setGuessNumber() {
        boolean isNotEqual = true;
        int int_random = rand.nextInt(100);
        int tryes = 0;

        System.out.println("Guess my number! (between 1 and 100) O_O");
        do {
            int userTryGuessing = input.nextInt();
            new HighLowRules(userTryGuessing);
            if (int_random > userTryGuessing) {
                System.out.println("Add more numbers my guy!");
                tryes++;
                System.out.println("Attempt #" + tryes);
            } else if (int_random < userTryGuessing) {
                System.out.println("Reduce some numbers ;)");
                tryes++;
                System.out.println("Attempt #" + tryes);
            } else {
                System.out.println("you won");
                System.out.println("You completed the game with " + tryes+ " attempts");
                isNotEqual = false;
            }

        } while (isNotEqual);

        System.out.println("Would you like to play again?");
        String playAgain = input.next();
        if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")){
            setGuessNumber();
        } else {
            System.out.println("Thanks for playing!!!");
        }
        return int_random;
    }
}
