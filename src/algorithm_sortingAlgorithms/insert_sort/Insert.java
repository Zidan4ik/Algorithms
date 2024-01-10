package algorithm_sortingAlgorithms.insert_sort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] arr = new int[]{5,2,1,8,0,-15,12,62,1};

        System.out.println("************************************");
        System.out.println("Array, before sort: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Array, after sort: " + Arrays.toString(arr));
        System.out.println("************************************");
        System.out.println(Arrays.toString(arr));

    }
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > currentValue) { //loop for sorted elements
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = currentValue;
        }
    }
}
