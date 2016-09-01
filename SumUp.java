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
        System.out.println("The average is "+ getAverage(myIntegers));
        //System.out.println("\r");
    }

    /**
     *
     * @param number take the input value from the user
     * @return  the values with the position in the array.
     */

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i =0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    /**
     * Add the values in the array and return the average.
     *
     * @param array takes the size of the array
     * @return  the average of the number in the array.
     */
    public  static double getAverage(int[] array){
        int sum =0;
        for(int i= 0; i < array.length; i++){
            sum += array[i];
        }
        return (double)sum/ (double)array.length;
    }

}
