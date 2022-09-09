package com.sept.xander.springboot.model;
import java.util.ArrayList;

public class Items {
    private ArrayList<Item> itemList;
    public Items() {
        this.itemList = new ArrayList<>();

    }

    public void addItemToList(Item i){
        this.itemList.add(i);
    }

    public Item getItemFromList(int index){
        return this.itemList.get(index);
    }

}
