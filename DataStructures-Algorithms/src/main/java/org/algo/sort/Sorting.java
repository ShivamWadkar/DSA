package org.algo.sort;

public class Sorting {

    public static void printArr(int[] arr){
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Each element will be compared with all elements - Smallest element will settle at 1st position - n^2
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Elements at consecutive positions gets compared - Largest element will settle at last position - Best case n(Sorted array), Worst case n^2
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            boolean swapped = false;
            for(int j = 0;j < n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    // Insert current element into sorted left portion - n log n
    public static void insertionSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }
    }

    public static void main(String[] args){
        int[] arr = {30, 20, 60, 50, 10, 40};
        //selectionSort(arr);
        //bubbleSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
