package util;

import java.util.Scanner;

public class Input {
    //    fields
    private Scanner scanner;
    private int min;
    private int max = 6;
    private double minDouble;
    private double maxDouble;


    //    methods for strings
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString() {
        System.out.println("Enter a number");
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

    //    int getInt(int min, int max) {
//        this.min = min;
//        this.max = max;
//        if (min < max && min >= 0) {
//            System.out.println("Great Selection!!");
//        } else {
//            return getInt();
//        }
//        return min;
//    }
//
//    public int getInt() {
//
//        System.out.println("Enter a number between 0 and 5");
//        this.min = scanner.nextInt();
//
//        getInt(this.min, this.max);
//        return this.min;
//    }
//
//    double getDouble(double min, double max) {
//        this.minDouble = min;
//        this.maxDouble = max;
//        if (min < max && min > 0) {
//            System.out.println("Within Range");
//        } else {
//            System.out.println("needs number between 1 and 20");
//            return getDouble();
//        }
//        return min;
//
//    }
//
//    public double getDouble() {
//        System.out.println("Enter a number between 1 and 20");
//        this.minDouble = scanner.nextDouble();
//        getDouble(this.minDouble, this.max);
//        return this.minDouble;
//    }
    public int getInt() {
        String inputUser = getString();
        try {
            return Integer.parseInt(inputUser);
        } catch (Exception e) {
            System.out.println("enter a number format");
            System.out.println(e);
            e.printStackTrace();
        }
        return getInt();
    }

    public double getDouble() {
        System.out.println("enter a decimal number");
        String inputUser = getString();
        try {
            return Double.parseDouble(inputUser);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return getDouble();
    }

    public int getBinary() {
        System.out.println("enter binary number");
        String inputUser = getString();
        try {
            System.out.println("convert from binary to decimal");
            return Integer.parseInt(inputUser, 2);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return getBinary();
    }

    ;

    public int getHex() {
        System.out.println("enter hex number");
        String inputUser = getString();
        try {
            System.out.println("convert from hex number to decimal");
            return Integer.parseInt(inputUser, 16);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return getHex();
    }

    public int getToBinary() {
        String inputUser = getString();
        try {
            System.out.println("convert from a number to binary number");
            return Integer.parseInt(Integer.toBinaryString(Integer.parseInt(inputUser)));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return getToBinary();
    }

}
