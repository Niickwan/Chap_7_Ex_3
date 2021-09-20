package com.company;

public class Main {

    public static int indexOfMax (int[] a){
        int maxValue = 0;
        for (int value : a) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arrayOfValues = {1, 5, 10, 8, 19, 12};
        System.out.println(indexOfMax(arrayOfValues));
    }
}

/*
Yes it's possible to use the enhanced for loop, since it circles all the values in the array.
 */