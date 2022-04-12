package util;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    //    fields
    private Scanner scanner;
    private int min;
    private int max = 6;
    private double minDouble;
    private double maxDouble;


//    methods for strings
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString() {
        System.out.println("Enter yes or no");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        if (getString().equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

//    methods for numbers

    int getInt(int min, int max) {
        this.min = min;
        this.max = max;
        if (min < max && min >= 0) {
            System.out.println("Great Selection!!");
        } else {
            return getInt();
        }
        return min;
    }

    public int getInt() {

        System.out.println("Enter a number between 0 and 5");
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
