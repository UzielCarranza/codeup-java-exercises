package GroceryListApp;

import util.Input;

import java.util.Scanner;

public class AppRunner {


    public static void main(String[] args) {

        Input input = new Input();
        Scanner sc = new Scanner(System.in);


        boolean appRunning = true;
        do {


            System.out.println("would you like to create a new list?");
            if (input.yesNo()) {
                GroceryList groceryBeverages = new GroceryList();
                System.out.println("Enter item name");
                String beverages = sc.next();
                groceryBeverages.setItem(beverages);
//            System.out.println("enter item quantity");
//            int itemQuantity = sc.nextInt();
//            groceryList.setQuantity(itemQuantity);
                System.out.println(groceryBeverages.getListBeverages());
                groceryBeverages.getListBeverages();
            }
        } while (appRunning);


    }
}
