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
        do {
            System.out.println("Guess my number");
            int userTryGuessing = input.nextInt();
            new HighLowRules(userTryGuessing);
            if (int_random > userTryGuessing) {
                System.out.println("Add more number my guy!");
            } else if (int_random < userTryGuessing) {

                System.out.println("Reduce some numbers ;)");
            } else {
                System.out.println("you won");
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
