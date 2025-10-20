package org.example;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,5,8,7,11};
        int small = Main.smallest_index(numbers);
        var smallFrom = indexOfSmallestFrom(numbers,2);
        System.out.println("Smallest from 2 is " + smallFrom);
        System.out.println(small);

        sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestNumberIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestNumberIndex);
        }
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if (startIndex > array.length) {return -1;}
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex + 1 ; i < array.length; i++ ) {
            if (array[i] < smallest) {
                smallest = array[i];
                startIndex = i;
            }
        }
        return startIndex;
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int smallest_index(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;


            }
        }
        return index;
    }
}




