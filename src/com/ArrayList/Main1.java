package com.ArrayList;

import java.util.Scanner;

class Main1 {
    private static Scanner epson = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInt = getIntegers(5);  // getInteger is a method that allow us to send 5 values to myInt array and return it in form of Array.
        for (int i = 0; i < myInt.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myInt[i]);
        }
        System.out.println("The average is = " + getAverage(myInt));
    }

    public static int[] getIntegers(int number) {   // number of elements in the Array we want to define
        System.out.println("Enter " + number + " integer values.\r"); // \r allow us to start from new line
        int[] values = new int[number];  // defining our array, using passed "number" as a number of elements to assign values array
        for (int i = 0; i < values.length; i++) {
            values[i] = epson.nextInt(); // getting input from user and storing it on array value;
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
