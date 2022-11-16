package com.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

class ArrayChallenge {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getUserInput(4);
        printArray(sortIntegers(array));


    }

    public static int[] getUserInput(int number) {
        System.out.println("Enter " + number + " integer value: \r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + i + ", typed in value was: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        // arrays can be sorted via for loop;
/*        int[] sortedArray = new int[array.length]; // creating array exactly the same size of array that has been passed to us
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }*/
        // and by using built in Method Arrays.copyOf()
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}