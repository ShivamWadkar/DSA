
package org.ds.array;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        // ============================
        // 1. Creating Arrays
        // ============================
        int[] arr1 = {5, 2, 9, 1, 7};

        int[] arr2 = new int[5]; // Default values = 0

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // ============================
        // 2. Accessing Elements
        // ============================
        System.out.println("\nFirst Element: " + arr1[0]);
        System.out.println("Last Element: " + arr1[arr1.length - 1]);

        // ============================
        // 3. Updating Element
        // ============================
        arr1[2] = 100;
        System.out.println("\nAfter Update: " + Arrays.toString(arr1));

        // ============================
        // 4. Traversing Array
        // ============================

        System.out.println("\nUsing for loop");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n\nUsing enhanced for loop");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        // ============================
        // 5. Sorting
        // ============================
        Arrays.sort(arr1);
        System.out.println("\n\nSorted: " + Arrays.toString(arr1));

        // ============================
        // 6. Binary Search
        // Array MUST be sorted
        // ============================
        int index = Arrays.binarySearch(arr1, 7);
        System.out.println("\nIndex of 7: " + index);

        // ============================
        // 7. Fill Array
        // ============================
        Arrays.fill(arr2, 10);
        System.out.println("\nFilled Array: " + Arrays.toString(arr2));

        // ============================
        // 8. Copy Array
        // ============================
        int[] copy = Arrays.copyOf(arr1, arr1.length);
        System.out.println("\nCopied Array: " + Arrays.toString(copy));

        // Copy first 3 elements
        int[] firstThree = Arrays.copyOf(arr1, 3);
        System.out.println("First 3 Elements: " + Arrays.toString(firstThree));

        // ============================
        // 9. Copy Range
        // fromIndex inclusive
        // toIndex exclusive
        // ============================
        int[] range = Arrays.copyOfRange(arr1, 1, 4);
        System.out.println("\nRange Copy: " + Arrays.toString(range));

        // ============================
        // 10. Compare Arrays
        // ============================
        System.out.println("\nArrays Equal? " + Arrays.equals(arr1, copy));

        // ============================
        // 11. Deep Equals (2D Arrays)
        // ============================
        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2},{3,4}};

        System.out.println("Deep Equals: " + Arrays.deepEquals(matrix1, matrix2));

        // ============================
        // 12. Print 2D Array
        // ============================
        System.out.println("\n2D Array:");
        System.out.println(Arrays.deepToString(matrix1));

        // ============================
        // 13. Stream
        // ============================
        int sum = Arrays.stream(arr1).sum();
        int max = Arrays.stream(arr1).max().getAsInt();
        int min = Arrays.stream(arr1).min().getAsInt();

        System.out.println("\nSum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // ============================
        // 14. Convert Array to String
        // ============================
        System.out.println("\nArray String: " + Arrays.toString(arr1));

        // ============================
        // 15. Length
        // ============================
        System.out.println("\nLength: " + arr1.length);

        // ============================
        // 16. Reverse Array (Manual)
        // ============================
        reverse(arr1);
        System.out.println("\nReversed: " + Arrays.toString(arr1));

        // ============================
        // 17. Find Maximum
        // ============================
        System.out.println("\nMaximum: " + findMax(arr1));

        // ============================
        // 18. Find Minimum
        // ============================
        System.out.println("Minimum: " + findMin(arr1));

        // ============================
        // 19. Linear Search
        // ============================
        System.out.println("Linear Search (100): " + linearSearch(arr1, 100));

        // ============================
        // 20. Clone
        // ============================
        int[] clone = arr1.clone();
        System.out.println("\nClone: " + Arrays.toString(clone));
    }

    // Reverse Array
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Maximum
    static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        return max;
    }

    // Minimum
    static int findMin(int[] arr) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
        }

        return min;
    }

    // Linear Search
    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}