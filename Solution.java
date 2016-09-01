package com.Babatunde;

/**
 * Created by Babatunde on 9/1/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Remember to Uncomment or Comment out the main class before running the program for
 * each section. The class is called Solution and every Main method has a different function.
 * There is a title attache to every Main methid.
 */

public class Solution {

    static int solveMeFirst(int a, int b) {
        int sum = a + b ;
        return sum;
    }


    /**
     * Warm-up
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }


    /**
     * TITLE : PRINT the sum of the array elements.
     *
     * @param args
     */
<<<<<<< HEAD
=======
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = in.nextInt();
        System.out.println("Now Enter the values into each array location: ");
        int arr[] = new int[n];
        int sum = 0;
        for(int arr_i=0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            sum +=arr[arr_i];
        }
            System.out.println("Number of objects in the list: "+ arr.length);
            System.out.print("Total sum: "+ sum);
    }


    /**
     * TITLE: NEXT LINE OF CODE ON HACKER RANK
     */

>>>>>>> parent of 3ec5cdd... Latest update
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = in.nextInt();
        System.out.println("Now Enter the values into each array location: ");
        int arr[] = new int[n];
        int sum = 0;
        for(int arr_i=0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            sum +=arr[arr_i];
        }
            System.out.println("Number of objects in the list: "+ arr.length);
            System.out.print("Total sum: "+ sum);
    }

}

