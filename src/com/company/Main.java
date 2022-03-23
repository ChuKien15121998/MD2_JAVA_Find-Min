package com.company;

public class Main {
    public static int minValue (int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        } return index;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,12,7,8,9,5,6,3,8};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
