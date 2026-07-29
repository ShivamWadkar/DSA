package org.algo.search;

public class Search {

    public static int linearSearch(int[] arr, int target){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int firstOccurrence(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        int answer = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                answer = mid;
                right = mid - 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static int lastOccurrence(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        int answer = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,2,4,5,7,8,10};

        System.out.println("Linear Search: " + linearSearch(arr, 5));
        System.out.println("Binary Search: "+ binarySearch(arr,7));
        System.out.println("First Occurrence "+ firstOccurrence(arr, 2));
        System.out.println("Last occurrence "+ lastOccurrence(arr, 2));
    }
}
