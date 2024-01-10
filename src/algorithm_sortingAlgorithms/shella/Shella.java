package algorithm_sortingAlgorithms.shella;

import java.util.Arrays;

public class Shella {

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println("************************************");
        System.out.println("Array, before sort: " + Arrays.toString(array));
        shelaSort(array);
        System.out.println("Array, after sort: " + Arrays.toString(array));
        System.out.println("************************************");
    }

    public static void shelaSort(int[] array) {
        int gap = array.length / 2;
// there is a difference between the elements
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Move the right pointer until we can find one such that
                // there will be no required space between it and the element before it
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // Recalculating the gap
            gap = gap / 2;
        }
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
