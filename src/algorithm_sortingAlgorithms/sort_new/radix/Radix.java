package algorithm_sortingAlgorithms.sort_new.radix;

import java.util.*;

public class Radix {
    private static int lvl;

    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10]; // range from 0 to 9
        Arrays.fill(count, 0); // set all values in array to 0

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        // cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        // copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        System.out.println("lvl "+(++lvl) +": "+Arrays.toString(arr));
    }


    static void radixSort(int arr[], int n) {
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

}
