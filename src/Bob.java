import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean continueRunningApp = true;


        System.out.println("Hey there, I am Bob... What can I do for you today?");

        do {

            String userInput = input.nextLine();
            if (userInput.endsWith("?")) {

                System.out.println("Sure...");

            } else if (userInput.endsWith("!")) {

                System.out.println("Whoa, chill out!");
            } else {
                System.out.println(" Fine. Be that way!");
                continueRunningApp = false;
            }
            System.out.println("Do you still need me?");
            String userInputContinues = input.nextLine();
            if (userInputContinues.equalsIgnoreCase("yes")) {

                System.out.println("What else I can assist you with?");
                continueRunningApp = true;
            } else {
                continueRunningApp = false;
            }

        } while (continueRunningApp);


    }

}



