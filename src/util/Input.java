package util;

import java.util.Scanner;

public class Input {
    //    fields
    private String scanner = String.valueOf(new Scanner(System.in));
    private int min;
    private int max;
    private double minDouble;
    private double maxDouble;



//    methods for strings

    String getString(String userInput) {
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
