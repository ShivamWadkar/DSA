package org.ds.queue;

public class CircularQueue {
    private int f;
    private int r;
    private int[] arr;

    public CircularQueue() {
        f = r = -1;
        arr = new int[5];
    }

    public CircularQueue(int size) {
        f = r = -1;
        arr = new int[size];
    }

    public void insert(int value) {
        if ((r == arr.length - 1 && f == 0) || (r + 1 == f)) {
            System.out.println("Queue is full");
        } else {
            if (f == -1) { // Cleaner check: If queue is completely empty
                f = 0;
                r = 0;
            } else if (r == arr.length - 1) {
                r = 0;
            } else {
                r++;
            }
            arr[r] = value;
        }
    }

    public int delete() {
        int value = -1;
        if (f == -1) { // Standard empty check
            System.out.println("Queue is empty");
        } else {
            value = arr[f];
            if (f == r) { // Only one element was left, reset queue
                f = r = -1;
            } else if (f == arr.length - 1) {
                f = 0;
            } else {
                f++;
            }
        }
        return value;
    }

    public void print() {
        if (f == -1) { // FIX: Use f == -1 to reliably check if empty
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        int curr = f;
        while (true) { // FIX: Loop tracks active elements instead of array length
            System.out.print(arr[curr] + " ");

            if (curr == r) { // Stop right after printing the rear element
                break;
            }

            curr++;
            if (curr == arr.length) {
                curr = 0;
            }
        }
        System.out.println();
    }
}
