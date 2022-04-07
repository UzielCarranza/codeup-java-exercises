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

                System.out.println("I hope that I answered your question :)");

            } else if (userInput.endsWith("!")) {

                System.out.println("Whoa, chill out!");
                System.out.println("I am going to ask you again and hope that you had calm your nerves...");
            } else if(userInput.isEmpty()){

                System.out.println("Fine. Be that way!");
                System.out.println("Ok, i hope that you are there now....");
            }
            else {
                System.out.println("Whatever!");

                System.out.println("hmmm just out of curiosity.......");
            }


            System.out.print(System.lineSeparator());
            System.out.println("Do you need me?");
            String userInputContinues = input.nextLine();
            if (userInputContinues.equalsIgnoreCase("yes")) {

                System.out.println("What else I can assist you with?");
                continueRunningApp = true;
            } else {

                System.out.println("We will se each other again... for the moment, bye :)");
                continueRunningApp = false;
            }

        } while (continueRunningApp);


    }

}



