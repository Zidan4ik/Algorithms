package algorithm_sortingAlgorithms.quick_sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int [] arr = new int[]{5,-1,0,2,6,-2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int divideIndex = findPosition(arr, start, end);
            quickSort(arr, start, divideIndex - 1);
            quickSort(arr, divideIndex, end);
        }
    }

    private static int findPosition(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        int pivot = arr[start];
        while (left <= right) {
            while (arr[left] < pivot) { // all numbers less than pivot
                left++;
            }
            while (arr[right] > pivot) { // all numbers greater than pivot
                right--;
            }
            if (left <= right) { // change position elements
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int num = arr[left];
        arr[left] = arr[right];
        arr[right] = num;
    }
}
