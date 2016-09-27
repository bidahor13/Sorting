package com.Babatunde;

import java.util.Scanner;

/**
 * Created by Babatunde on 8/31/2016.
 */
public class Resize {
    private static Scanner scan = new Scanner(System.in);
    private static int[] baseData = new int[10];


    public static void main(String[] args){
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integer: ");
        getInput();
        printArray(baseData);
    }


    /**
     * Get the input and store directly to the array
     */
    public static void getInput(){
        for (int i =0; i < baseData.length; i++){
            baseData[i] = scan.nextInt();
        }
    }

    /**
     * This method print out all the objects in array.
     *
     * @param arr  The method takes a parameter arr.
     */
    public static void printArray(int[] arr){
        for(int i = 0;  i < arr.length; i++){
            System.out.println(arr[i]+ " ");
            System.out.println();
        }
    }



    /**
     * This method resizes the Array
     */

    private  static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for(int i=0; i < original.length ; i++){
            baseData[i] = original[i];
        }

    }
}
