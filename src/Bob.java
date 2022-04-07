import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean continueRunningApp = true;


        System.out.println("Hey there, I am Bob... What can I do for you today?");

        String userInput = input.nextLine();
        if (userInput.endsWith("?")) {

            System.out.println("Sure...");

        } else if (userInput.endsWith("!")) {

            System.out.println("Whoa, chill out!");
        } else {
            System.out.println(" Fine. Be that way!");
        }

    }

}



