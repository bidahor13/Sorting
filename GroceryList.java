package com.Babatunde;

import java.util.ArrayList;

/**
 * Created by Babatunde on 8/31/2016.
 */
public class GroceryList {
    //private int[] number;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have: "+ groceryList.size() + "items in you grocery list");
        for(int i= 0; i < groceryList.size(); i++){
            System.out.println((i+1)+" ."+groceryList.get(i));
        }
    }

    /**
     * This method the location of the item on the grocery list.
     *
     * @param position   Takes the value of the position of the item on the ArrayLsit
     * @param newItem    Is the item to be added to the arrayList
     */
    public  void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item" + (position + 1) +" has been modified");
    }


    /**
     * This method removes an item from the grocery list.
     *
     * @param position  The position of the item on the list to be remove.
     */
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    /**
     * This method is use to find an item on the grocery list.
     *
     * @param searchItem
     * @return
     */
    public String findItem(String searchItem){
        //boolean exist =  groceryList.contains(searchItem);
        int position =  groceryList.indexOf(searchItem);
        if(position >= 0){
            return  groceryList.get(position); // this will return the position of the item in the grocery list
        }
        return null;


    }
}
