package com.Babatunde;

import java.util.Scanner;

/**
 * Created by Babatunde on 8/27/2016.
 */
public class SumUp {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
    }


    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i =0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

}
