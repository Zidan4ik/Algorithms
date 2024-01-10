package algorithm_sortingAlgorithms.gnome_sort;

import java.util.Arrays;

public class Gnome {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 0, 5, 1, 10};
        System.out.println("************************************");
        System.out.println("Array, before sort: " + Arrays.toString(arr));
        gnomeSort(arr);
        System.out.println("Array, after sort: " + Arrays.toString(arr));
        System.out.println("************************************");
    }

    public static void gnomeSort(int[] arr) {
        int index = 1;
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] <= arr[i + 1]) {
                i = index;
                index += 1;
            } else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i - 1;
                if (i < 0) { // checked whether 'i' has not gone outside the array
                    i = index;
                    index += 1;
                }
            }
        }
    }

}
