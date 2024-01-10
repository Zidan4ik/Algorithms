package algorithm_sortingAlgorithms.bubble_sort;

import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < (size - 1); i++) {

            boolean flag = false; // check if swapping occurs

            for (int j = 0; j < (size - i - 1); j++) { // loop to compare elements


                if (array[j] > array[j + 1]) { //comparing between elements

                    // process trading on position between elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = true;
                }
            }
            if (!flag) // check flag if there was no change elements on indexes
                break;

        }
    }

    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};

        System.out.println("************************************");
        System.out.println("Array, before sort: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("Array, after sort: " + Arrays.toString(data));
        System.out.println("************************************");
    }
}

