package GroceryListApp;

import java.util.HashMap;

public class GroceryList {
    HashMap list;
    String item;
    int itemQuantity;



    public GroceryList(){

    }

    public HashMap getList() {
        return list;
    }

    public void setList(HashMap list) {
        this.list = list;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
