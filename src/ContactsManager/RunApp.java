package ContactsManager;

import java.io.File;
import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the path to create a directory: ");
        System.out.println("Enter the name of the desired a directory: ");
        String path = sc.next();
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Sorry couldn’t create specified directory");
        }
    }

}
