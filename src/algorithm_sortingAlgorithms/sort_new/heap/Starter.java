package algorithm_sortingAlgorithms.sort_new.heap;

import java.util.Arrays;

import static algorithm_sortingAlgorithms.sort_new.heap.Heap.sortHeap;

public class Starter {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, -1, 802, 24, 2, 66};
        System.out.println("Working method's heap sorting for array");
        System.out.println("Before sorting: \n" + Arrays.toString(arr));
        sortHeap(arr);
        System.out.println("After sorting: \n" + Arrays.toString(arr));
    }
}
