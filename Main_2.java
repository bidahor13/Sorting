package com.Babatunde;

/**
 * Created by Babatunde on 8/27/2016.
 */
public class Main_2 {

    public static void main(String[] args) {
        int[] myIntArray = new int[25];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
            //System.out.println("Element "+ i + ", Value is " + myIntArray[i]);
        }
        printArray(myIntArray);
    }


    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("Element " + i + ", Value is " + array[i]);
        }
    }
}


