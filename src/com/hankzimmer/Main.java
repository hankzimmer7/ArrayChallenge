package com.hankzimmer;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        System.out.println("\nUnsorted Array:");
        printArray(unsortedArray);
        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println("\nSorted Array:");
        printArray(sortedArray);
    }

    //Method takes inputs from the user and puts them in an array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //Method prints out each element in an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    //Method takes an array of integers and sorts the array from smallest to largest using bubble sort
    public static int[] sortIntegers(int[] array) {
        boolean arrayIsSorted = false;
        while (!arrayIsSorted) {
            arrayIsSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    arrayIsSorted = false;
                }
            }
        }
        return array;
    }
}
