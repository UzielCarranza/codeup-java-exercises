package util;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    //    fields
    private Scanner scanner = new Scanner(System.in);
    private int min;
    private int max = 20;
    private double minDouble;
    private double maxDouble;


//    methods for strings

    String getString() {
        System.out.println("Enter yes or no");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        if (getString().matches("(?i)y | yes | Y | Yes")) {
            return true;
        } else {
            return false;
        }
    }

//    methods for numbers

    int getInt(int min, int max) {
        this.min = min;
        this.max = max;
        if (min < max && min > 0) {
            System.out.println("Within Range");
        } else {
            System.out.println("needs number between 1 and 20");
            return getInt();
        }
        return min;
    }

    public int getInt() {

        System.out.println("Enter a number between 1 and 20");
        this.min = scanner.nextInt();

        getInt(this.min, this.max);
        return this.min;
    }

    double getDouble(double min, double max) {
        this.minDouble = min;
        this.maxDouble = max;
        if (min < max && min > 0) {
            System.out.println("Within Range");
        } else {
            System.out.println("needs number between 1 and 20");
            return getDouble();
        }
        return min;

    }

    public double getDouble() {
        System.out.println("Enter a number between 1 and 20");
        this.minDouble = scanner.nextDouble();
        getDouble(this.minDouble, this.max);
        return this.minDouble;
    }


}
