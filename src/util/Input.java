package util;

import java.util.Scanner;

public class Input {
    //    fields
    private Scanner scanner = new Scanner(System.in);


//    methods

    String getString(Scanner userInput) {
        this.scanner = userInput;
        return String.valueOf(userInput);
    }

    boolean yesNo() {
        return getString(this.scanner).equalsIgnoreCase("yes") || getString(this.scanner).equalsIgnoreCase("y");
    }

    int getInt(int min, int max) {

        return min;
    }

    int getInt() {

        return 0;
    }

    double getDouble(double min, double max) {

        return min;
    }

    double getDouble() {

        return 0;
    }

}
