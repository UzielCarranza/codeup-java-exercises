package warmups;

import java.util.Locale;
import java.util.Scanner;

public class BackPack {

    private Scanner scanner = new Scanner(System.in);
    private boolean lid;
    private double leftStrap;
    private double rightStrap;




    String getString() {
        System.out.println("Enter yes or no");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        if (getString().toLowerCase(Locale.ROOT).equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

}
