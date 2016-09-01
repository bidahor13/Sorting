package com.Babatunde;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Babatunde on 8/29/2016.
 */
public class SortList {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        int[] sortNumber = getIntegers(5);
        int[] sortedResult = sortIntegers(sortNumber);
        printArray(sortedResult);
        }

    /**
     *
     * This method takes the input values from user
     *
     * @param size of the array
     * @return
     */
    public static int[] getIntegers(int size){
        int[] arrayValues = new int[size];
        System.out.println("Enter "+ size + " integer values.\r");

        for(int i =0;  i < arrayValues.length; i ++){
            arrayValues[i] = scan.nextInt();
        }
        return arrayValues;
    }

    public static void printArray(int[] arrayValues) {
        for (int i = 0; i < arrayValues.length; i++) {
            System.out.println("Element "+ i + " content "+ arrayValues[i]);
        }

    }

    /**
     *
     * This method would copy the existing array and sort.
     * @param arrayValues
     * @return sortedArray
     */
    public static int[] sortIntegers(int[] arrayValues){
//        int[] sortedArray = new int[arrayValues.length];
//        for(int i=0; i < arrayValues.length; i++){
//            sortedArray[i] = arrayValues[i];
//        }

        int[] sortedArray = Arrays.copyOf(arrayValues,arrayValues.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag =false;
            for(int i = 0; i <sortedArray.length-1; i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}
