// package com.company; // For Intellij IDE

public class Main {

    public static void main(String[] args) {
        int find = 49; // Find this number
        int arr[] = {1,3,7,9,17,29,30,32,49}; // Array to find element in

        int lowIndex = 0; // Lowest index value (int) find is in
        int highIndex = arr.length - 1; // Highest index value (int) find is in
        int midIndex = (lowIndex + highIndex)/2;

        while (lowIndex <= highIndex){ // The space between lowIndex and highIndex decreases until you find the element
            if (arr[midIndex] == find){
                System.out.println("The number " + find + " is in this array"); // (int) find found!
                return; // End program
            }
            else if (arr[midIndex] > find){ // (int) find is in the second half of the array being searched
               highIndex = midIndex - 1; // Change highIndex to middleIndex and try searching again
            }
            else if (arr[midIndex] < find){ // The middle value is less than (int) find
                lowIndex = midIndex + 1; // Change lowIndex to middleIndex and try searching again
            }
            midIndex = (lowIndex + highIndex)/2;
        }
       // If loop finishes with returning, then (int) find doesn't exist in the array
        System.out.println("Element not found");
    }
}

