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
        if (getString().toLowerCase(Locale.ROOT).equalsIgnoreCase("yes")){
            return true;
        } else{
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
            return getInt();
        }
        return min;
    }

    int getInt()  {
        System.out.println("needs to be between 0 and 25");
        return 0;
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
        System.out.println("needs to be between 0 and 25");
        return 0;
    }

}
