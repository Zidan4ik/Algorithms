package algorithm_sortingAlgorithms.sort_new.radix;

import java.util.Arrays;

import static algorithm_sortingAlgorithms.sort_new.radix.Radix.radixSort;

public class Starter {
    public static void main(String[] args) {
        int[] arr = {12,59,12,0,4,143,88};

        System.out.println("Working method's radix sorting for array");
        System.out.println("Before sorting: "+ Arrays.toString(arr));
        radixSort(arr, arr.length);
        System.out.println("After sorting: "+ Arrays.toString(arr));
    }
}
