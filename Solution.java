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

//    static int solveMeFirst(int a, int b) {
//        int sum = a + b ;
//        return sum;
//    }


    /**
     * Warm-up
     *
     * @param args
     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a;
//        a = in.nextInt();
//        int b;
//        b = in.nextInt();
//        int sum;
//        sum = solveMeFirst(a, b);
//        System.out.println(sum);
//    }


    /**
     * TITLE : PRINT the sum of the array elements.
     *
     * @param args
     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of your array: ");
//        int n = in.nextInt();
//        System.out.println("Now Enter the values into each array location: ");
//        int arr[] = new int[n];
//        int sum = 0;
//        for(int arr_i=0; arr_i < n; arr_i++) {
//            arr[arr_i] = in.nextInt();
//            sum +=arr[arr_i];
//        }
//            System.out.println("Number of objects in the list: "+ arr.length);
//            System.out.print("Total sum: "+ sum);
//    }


    /**
     * TITLE: NEXT LINE OF CODE ON HACKER RANK
     */

    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter you First name: ");
            String fName = input.next();
            if (fName.matches("^-?\\d+$")) {
                System.out.println("Invalid input data at First Name... ");

            }

            System.out.println("Enter you Last name: ");
            String lName = input.next();
            if ((lName.matches("^-?\\d+$") )) {
                System.out.println("Invalid input data at Last Name... ");
                return;
            }

            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            if((age == (int)age)){

                /**
                 * Output to the Screen
                 */
                System.out.println("**********Bio Data below***************");
                System.out.print(fName.trim() + " " + lName.trim());
                System.out.println("\n Age: " + age);
            }

        } catch (InputMismatchException err) {
            System.out.println(" Try Catch result: ==== Invalid data! Check your input");
        }

    }
}











