package algorithm_sortingAlgorithms.sort_new.pancake;

import java.util.Arrays;

import static algorithm_sortingAlgorithms.sort_new.pancake.Pancake.pancakeSort;

public class Starter {
    public static void main (String[] args) {
        int arr[] = {23, 10, 20, 11, 12, 6, 7};
        System.out.println("Working method's Pancake sorting for array");
        System.out.println("Before sorting: \n" + Arrays.toString(arr));
        pancakeSort(arr, arr.length);
        System.out.println("After sorting: \n" + Arrays.toString(arr));
    }
}
