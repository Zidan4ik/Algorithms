package algorithm_sortingAlgorithms.sort_old.count_sort;
// Counting sort in Java programming

import java.util.Arrays;

class CountSort {
       static void countSort(int array[], int size) {
            int[] output = new int[size + 1];
            int max = array[0]; // Find the largest element of the array
            for (int i = 1; i < size; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            int[] count = new int[max + 1];
            for (int i = 0; i < max; ++i) { // Initialize count array with all zeros.
                count[i] = 0;
            }

            for (int i = 0; i < size; i++) { // Store the count of each element
                count[array[i]]++;
            }

            for (int i = 1; i <= max; i++) { // Store the cumulative count of each array
                count[i] += count[i - 1];
            }

            // Find the index of each element of the original array in count array, and
            // place the elements in output array
            for (int i = size - 1; i >= 0; i--) {
                output[count[array[i]] - 1] = array[i];
                count[array[i]]--;
            }

            // Copy the sorted elements into original array
            for (int i = 0; i < size; i++) {
                array[i] = output[i];
            }
        }

    public static void main(String args[]) {
        int [] arr = new int[]{2,1,4,0,5,1,10};
        System.out.println("************************************");
        System.out.println("Array, before sort: "+ Arrays.toString(arr));
        countSort(arr,arr.length);
        System.out.println("Array, after sort: "+ Arrays.toString(arr));
        System.out.println("************************************");
    }
}