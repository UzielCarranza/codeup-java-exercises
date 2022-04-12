package warmups;

import java.util.Locale;
import java.util.Scanner;

public class BackPack {
    public static void main(String[] args) {
        BackPack backPack = new BackPack();
//        backPack.GetLeftStrapLength();
//        backPack.GetReftStrapLength();
//        backPack.GetLidStatus();
        System.out.println(backPack.GetLeftStrapLength());
        System.out.println(backPack.GetReftStrapLength());
        backPack.SetLidStatus();
    }

//    fields

    private Scanner scanner = new Scanner(System.in);
    private boolean lid;
    private double leftStrap;
    private double rightStrap;


//    constructor
    public  BackPack(){
    }

    public BackPack(boolean lid, double leftStrap, double rightStrap) {
        this.lid = lid;
        this.leftStrap = leftStrap;
        this.rightStrap = rightStrap;
    }


    //    getters and setters
    public String GetLidStatus() {
        System.out.println("Would you like to open up the backpack? y/n");
        String userInput = scanner.next();
        return userInput;
    }

    boolean SetLidStatus() {
        if (GetLidStatus().equalsIgnoreCase("yes")) {
            System.out.println("backpack is open");
            return this.lid = true;

        } else {
            System.out.println("backpack is closed");
            return this.lid = false;
        }
    }

    public double GetLeftStrapLength() {

        System.out.println("Enter left strap length");
        double strapLeftLength = scanner.nextDouble();
        return this.leftStrap = strapLeftLength;


    }

    double SetLeftStrapLength() {
        return this.leftStrap;
    }

    public double GetReftStrapLength() {

        System.out.println("Enter right strap length");
        double strapRightLength = scanner.nextDouble();
        return this.rightStrap = strapRightLength;


    }

    double SetRightStrapLength() {
        return this.rightStrap;
    }

}
