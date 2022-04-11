package util;

import java.util.Scanner;

public class Input {
    //    fields
    private Scanner scanner = new Scanner(System.in);
    private int min;
    private int max;
    private double minDouble;
    private double maxDouble;



//    methods for strings

    String getString(Scanner userInput) {
        this.scanner = userInput;
        return String.valueOf(userInput);
    }

    boolean yesNo() {
        return getString(this.scanner).equalsIgnoreCase("yes") || getString(this.scanner).equalsIgnoreCase("y");
    }

//    methods for numbers

    int getInt(int min, int max) {
        this.min = min;
        this.max = max;
        if (min < 0 && min > max) {
            getInt(this.min, this.max);
            System.out.println("needs to be within range range");
        }
        return getInt();
    }

    int getInt() {
        return getInt(this.min, this.max);

    }

    double getDouble(double min, double max) {
        this.minDouble = min;
        this.maxDouble = max;
        if (min < 0 && min > max) {
            getDouble(this.minDouble, this.maxDouble);
            System.out.println("needs to be within range");
        }
        return getDouble();

    }

    double getDouble() {

        return getDouble(this.minDouble, this.maxDouble);
    }

}
