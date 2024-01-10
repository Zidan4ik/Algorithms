package algorithm_sortingAlgorithms.shuttle_sort;

import java.util.Arrays;

public class Shuttle {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 10, 3, 1, 2, 5};
        System.out.println("************************************");
        System.out.println("Array, before sort: " + Arrays.toString(arr));
        shuttleSort(arr);
        System.out.println("Array, after sort: " + Arrays.toString(arr));
        System.out.println("************************************");
    }
    public static void shuttleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
