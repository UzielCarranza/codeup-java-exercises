package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    //    fields
    private Scanner scanner = new Scanner(System.in);
    private int min;
    private int max;
    private double minDouble;
    private double maxDouble;


//    methods for strings

    String getString() {
        System.out.println("Enter yes or no");
        String userInput = scanner.nextLine();
        return userInput;
    }

    boolean yesNo() {
        if (getString().toLowerCase(Locale.ROOT).equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

//    methods for numbers

    int getInt(int min, int max) {
        this.min = min;
        this.max = max;
        if (min > 0 && min < max && max <= 25) {
            System.out.println("Within Range");
        } else {
            System.out.println("needs number between 0 and 25");
            return getInt();
        }
        return min;
    }

    int getInt() {

        System.out.println("Enter a number between 0 and 10");
        this.min = scanner.nextInt();


        System.out.println("Enter a number between 10 and 25");
        this.max = scanner.nextInt();
        getInt(this.min, this.max);
        return this.min;
    }

    double getDouble(double min, double max) {
        this.minDouble = min;
        this.maxDouble = max;
        if (min > 0 && min < max && max <= 25) {
            System.out.println("Within Range");
        } else {
            return getDouble();
        }
        return min;

    }

    double getDouble() {
        System.out.println("Enter a number between 0 and 10");
        this.minDouble = scanner.nextDouble();

        System.out.println("Enter a number between 10 and 25");
        this.maxDouble = scanner.nextDouble();
        getDouble(this.minDouble, this.maxDouble);
        return this.minDouble;
    }

}
