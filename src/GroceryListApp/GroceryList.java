package GroceryListApp;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private Scanner sc = new Scanner(System.in);

    public void GroceryListBeverages() {
        ArrayList<String> beverages = new ArrayList<>();
        ArrayList<Integer> beveragesQuantity = new ArrayList<>();
        boolean keepAdding = true;
        System.out.println("Beverages category");
        do {
            System.out.println("add a beverage");
            String beverage = sc.next();
            System.out.println("How many?");
            int beverageQuantity = sc.nextInt();
            beverages.add(beverage);
            System.out.println("current list");
            beveragesQuantity.add(beverageQuantity);
            for (int i = 0; i < beverages.size(); i++) {
                for (int j = 0; i < beveragesQuantity.size(); i++) {
                    System.out.println(" - " + beverages.get(i) + " quantity: " + beveragesQuantity.get(i));
                }
            }
            System.out.println("would you like to keep adding more beverages?");
            String userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                keepAdding = true;
            } else {
                keepAdding = false;
                System.out.println("here is the list");
                for (int i = 0; i < beverages.size(); i++) {
                    System.out.println(beverages.get(i) + " quantity: " + beveragesQuantity.get(i));
                }
            }
        } while (keepAdding);
    }

    public void GroceryListFruits() {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> fruitsQuantity = new ArrayList<>();
        System.out.println("Fruits category");
        boolean keepAdding = true;
        do {
            System.out.println("add a fruit");
            String beverage = sc.next();
            System.out.println("How many?");
            int beverageQuantity = sc.nextInt();
            fruits.add(beverage);
            System.out.println("current list");
            fruitsQuantity.add(beverageQuantity);
            for (int i = 0; i < fruits.size(); i++) {
                for (int j = 0; i < fruitsQuantity.size(); i++) {
                    System.out.println(" - " + fruits.get(i) + " quantity: " + fruitsQuantity.get(i));
                }
            }
            System.out.println("would you like to keep adding more fruits?");
            String userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                keepAdding = true;
            } else {
                keepAdding = false;
                System.out.println("here is the list");
                for (int i = 0; i < fruits.size(); i++) {
                    System.out.println(fruits.get(i) + " quantity: " + fruitsQuantity.get(i));
                }
            }
        } while (keepAdding);

    }


    public void GroceryListVegetables() {
        ArrayList<String> vegetables = new ArrayList<>();
        ArrayList<Integer> vegetablesQuantity = new ArrayList<>();
        System.out.println("vegetables category");
        boolean keepAdding = true;
        do {
            System.out.println("add a vegetable");
            String vegetable = sc.next();
            System.out.println("How many?");
            int vegetableQuantity = sc.nextInt();
            vegetables.add(vegetable);
            System.out.println("current list");
            vegetablesQuantity.add(vegetableQuantity);
            for (int i = 0; i < vegetables.size(); i++) {
                for (int j = 0; i < vegetablesQuantity.size(); i++) {
                    System.out.println(" - " + vegetables.get(i) + " quantity: " + vegetablesQuantity.get(i));
                }
            }
            System.out.println("would you like to keep adding more vegetables?");
            String userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                keepAdding = true;
            } else {
                keepAdding = false;
                System.out.println("here is the list");
                for (int i = 0; i < vegetables.size(); i++) {
                    System.out.println(vegetables.get(i) + " quantity: " + vegetablesQuantity.get(i));
                }
            }
        } while (keepAdding);

    }

//    public ArrayList<String> getListBeverages() {
////
////        this.beveragesList = new ArrayList<String>();
////        beveragesList.add(getItem());
////        return this.beveragesList;
//
//
//        this.beveragesList  = new ArrayList<String>();
//        for(int i=0; i < beveragesList.size(); i++){
//            ;
//            //do whatever initialization you need here
//            beveragesList.add(getItem());
//        }
//        return this.beveragesList;
//    }

//
//    public void setBeverages(List<String> beverages) {
//        this.beverages = beverages;
//    }
//
//    public String getItem() {
//        return item;
//    }
//
//    public void setItem(String item) {
//        this.item = item;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
}
