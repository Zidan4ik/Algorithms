package algorithm_sortingAlgorithms.sort_new.comb;

import java.util.Arrays;

import static algorithm_sortingAlgorithms.sort_new.comb.Comb.combSort;


public class Starter {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Working method's comb sorting for array");
        System.out.println("Before sorting: \n"+ Arrays.toString(arr));
        combSort(arr, arr.length);
        System.out.println("After sorting: \n"+ Arrays.toString(arr));
    }
}
