package GroceryListApp;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<String> beveragesList;
    String item;
    int quantity;

    public GroceryList() {
    }

    public ArrayList<String> getListBeverages() {
//
//        this.beveragesList = new ArrayList<String>();
//        beveragesList.add(getItem());
//        return this.beveragesList;


        this.beveragesList  = new ArrayList<String>();
        for(int i=0; i < beveragesList.size(); i++){
            ;
            //do whatever initialization you need here
            beveragesList.add(getItem());
        }
        return this.beveragesList;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
