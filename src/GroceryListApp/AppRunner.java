package GroceryListApp;

import util.Input;

import java.util.Scanner;

public class AppRunner {


    public static void main(String[] args) {

        Input input = new Input();
//
////
//        boolean appRunning = true;
//        do {
//
//
//            System.out.println("would you like to create a new list?");
//            if (input.yesNo()) {
//                GroceryList groceryBeverages = new GroceryList();
//                System.out.println("Enter item name");
//                String beverages = sc.next();
//                groceryBeverages.setItem(beverages);
////            System.out.println("enter item quantity");
////            int itemQuantity = sc.nextInt();
////            groceryList.setQuantity(itemQuantity);
//                System.out.println(groceryBeverages.getBeverages());
//                groceryBeverages.getBeverages();
//            }
//        } while (appRunning);


//        ArrayList<String> people = new ArrayList<>();
//        people.add("e");
//        people.add("d");
//        System.out.println(people);
//        for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i));
//        }
//
//
//        String[] toppings = {"peperonni", "sausage", "mushrooms", "pineapple", "olives"};
//        List<String> toppingList = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i = 0; i < 40; i++) {
//            toppingList.add(toppings[random.nextInt(toppings.length)]);
//
//        }
//        for (String topping : toppingList) {
//            System.out.println(topping);
//        }
//
//        HashMap<String, Integer> toppingsMap = new HashMap<>();
//        for (String topping : toppingList) {
////            toppingsMap.putIfAbsent(topping, 1);
//            if (toppingsMap.containsKey(topping)) {
//                toppingsMap.replace(topping, toppingsMap.get(topping) + 1);
//            } else {
//
//                toppingsMap.putIfAbsent(topping, 1);
//            }
//        }
//        System.out.println(toppingsMap.get("peperonni"));
//    }

//        ArrayList<String> beverages = new ArrayList<>();
//        ArrayList<Integer> beveragesQuantity = new ArrayList<>();
//        boolean keepAdding = true;
//        do {
//            System.out.println("add a beverage");
//            String beverage = sc.next();
//            System.out.println("How many?");
//            int beverageQuantity = sc.nextInt();
//            beverages.add(beverage);
//            System.out.println("current list");
//            beveragesQuantity.add(beverageQuantity);
//            for (int i = 0; i < beverages.size(); i++) {
//                for (int j = 0; i < beveragesQuantity.size(); i++) {
//                    System.out.println(" - " + beverages.get(i) + " quantity: " + beveragesQuantity.get(i));
//                }
//            }
//            System.out.println("would you like to keep adding more beverages?");
//            String userResponse = sc.next();
//            if (userResponse.equalsIgnoreCase("yes")) {
//                keepAdding = true;
//            } else {
//                keepAdding = false;
//                System.out.println("here is the list");
//                for (int i = 0; i < beverages.size(); i++) {
//                    System.out.println(beverages.get(i) + " quantity: "+ beveragesQuantity.get(i));
//                }
//            }
//        } while (keepAdding);
        String keepUsingApp;
        do {


            GroceryList category = new GroceryList();
            System.out.println("what category would you like to create? ");
            System.out.println("Beverages  |  fruits  | vegetables ");
            Scanner sc = new Scanner(System.in);
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("beverages")) {
                category.GroceryListBeverages();
            } else if (userChoice.equalsIgnoreCase("fruits")) {
                category.GroceryListFruits();
            } else if (userChoice.equalsIgnoreCase("vegetables")) {
                category.GroceryListVegetables();
            }
            System.out.println("would you like to keep using the app?");
            keepUsingApp = sc.next();
        } while (keepUsingApp.equalsIgnoreCase("yes"));
    }


}
